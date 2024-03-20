•	cumeQtrReportAction.java


package gov.bls.dbes.sled.action;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import gov.bls.dbes.sled.dao.*;
import gov.bls.dbes.sled.form.*;
import gov.bls.dbes.sled.util.Firm;
import gov.bls.dbes.sled.util.HistWorksiteCrosswalk;
import gov.bls.dbes.sled.util.QtrObj;
import gov.bls.dbes.sled.util.HistWorksite;
import gov.bls.dbes.sled.business.FirmsBusiness;
import gov.bls.dbes.sled.business.SessionInfoBusiness;

public class CumeQtrReportAction extends SledAction 
{
	final String FIVE_BLANKS = "     ";
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	{
		String strutsAction = "cumeQtrReport";
		try
		{
			SledDao dao = getDAOobjFromPool();
			CumeQtrReportForm theForm = (CumeQtrReportForm)form;
			String firmID = theForm.getFirmID();
			String hiYearQtr = FIVE_BLANKS;
			String loYearQtr = FIVE_BLANKS;
			long lFirmID = -1;
			if (firmID == null)
			{
				SessionInfoBusiness sledSession = 
					(SessionInfoBusiness)request.getSession().getAttribute("sledSession");
				lFirmID = sledSession.getFirmObj().getFirmID();
			}
			else
			{
				lFirmID = Long.parseLong(firmID);
				if (theForm.getFirmIDstart().equals(firmID))  // user has not changed
													 		  // the selected firm
				{
					hiYearQtr = theForm.getHiYearQtr();
					loYearQtr = theForm.getLoYearQtr();
				}
			}
			theForm.setFirmIDstart("" + lFirmID);
			FirmsBusiness firmsB = 
			    new FirmsBusiness(-1, lFirmID, dao, false);
			request.setAttribute("firmsBusiness", firmsB);
			// set up the display of quarters:
			long selectedFirmID = firmsB.getSelectedFirmID();
			Firm firm = dao.Get_Firm_Stats(selectedFirmID);
			if (firm.getMaxYearQtr() == null) 
			{
				theForm.setHaveData("0");
				return (mapping.findForward(strutsAction));
			}
			theForm.setHaveData("1");    // there is history data to display
			if (hiYearQtr.equals(FIVE_BLANKS))
				loYearQtr = hiYearQtr = firm.getMaxYearQtr();
			Vector hiQuarters = 
				getQuartersInRange(firm.getMaxYearQtr(), firm.getMinYearQtr(),
						           hiYearQtr);
			theForm.setHiQuarterVec(hiQuarters);
			Vector loQuarters = 
				getQuartersInRange(firm.getMaxYearQtr(), firm.getMinYearQtr(),
						           loYearQtr);
			theForm.setLoQuarterVec(loQuarters);
			// Adjust hiYearQtr and loYearQtr filters so they are not
			// outside of the data that occrus for the firm:
			if (hiYearQtr.compareTo(firm.getMaxYearQtr()) > 0)
			{
				hiYearQtr = firm.getMaxYearQtr();
				if (loYearQtr.compareTo(hiYearQtr) > 0)
					loYearQtr = hiYearQtr;
			}
			if (loYearQtr.compareTo(firm.getMinYearQtr()) < 0)
			{
				loYearQtr = firm.getMaxYearQtr();
				if (hiYearQtr.compareTo(loYearQtr) < 0)
					hiYearQtr = loYearQtr;
			}
			// get the data to display:
			Vector dataVec = dao.Get_Hist_Crosswalk_For_Firm(firm.getFirmID(), 
							 loYearQtr.substring(0, 4), 
							 loYearQtr.substring(4),
							 hiYearQtr.substring(0, 4), 
							 hiYearQtr.substring(4));
			// set the background color of some rows, so the viewere will
			// be able to see rows that go together (for a single site):
			colorizeRows(dataVec);
			theForm.setDataVec(dataVec);
			// save the filtering arguments, in case respondent wants
			// to produce Excel later:
			CumeQtrReportForm newForm = setupForExcel(firm.getFirmID(), loYearQtr, hiYearQtr);
			request.getSession(false).setAttribute("cumeQtrReportArgs", newForm);
		} 
		catch (Exception e)
		{
			ShowerrorForm sfrm = new ShowerrorForm();
			sfrm.setErrmsg("ERROR in CumeQtrReportAction: " + e);
			request.setAttribute("errBean", sfrm);
		    strutsAction = "showError";
		}
		return (mapping.findForward(strutsAction));
	}

	// Return a Vector of QtrObj objects, covering the specified quarter range
	private Vector getQuartersInRange(String maxYearQtr, String minYearQtr,
										String selectedYearQtr)
	{
		Vector vec = new Vector();
		int maxYear = Integer.parseInt(maxYearQtr.substring(0, 4));
		int maxQtr  = Integer.parseInt(maxYearQtr.substring(4));
		int minYear = Integer.parseInt(minYearQtr.substring(0, 4));
		int minQtr  = Integer.parseInt(minYearQtr.substring(4));
		QtrObj maxQtrObj = new QtrObj(maxYear, maxQtr);
		QtrObj minQtrObj = new QtrObj(minYear, minQtr);
		for (QtrObj lookObj = maxQtrObj;
			 lookObj.difference(minQtrObj) >= 0;
			 lookObj = new QtrObj(lookObj, -1))
		{
			if (lookObj.getYearQtr().equals(selectedYearQtr))
				lookObj.setSelected("1");
			vec.add(lookObj); 
		}
		return vec;
	}

	// set the background color of some rows, so the viewere will
	// be able to see rows that go together (for a single site):
	private void colorizeRows(Vector dataVec)
	{
		Iterator it = dataVec.iterator();
		HistWorksiteCrosswalk prevHist = null;
		
		while(it.hasNext())
		{
			HistWorksiteCrosswalk hist = (HistWorksiteCrosswalk)it.next();
			if (prevHist != null && 
				prevHist.getWorksiteID() != hist.getWorksiteID())
			  prevHist.setSelected("1");
			prevHist = hist;
		}
		if (prevHist != null)
			  prevHist.setSelected("1");
	}

	private CumeQtrReportForm setupForExcel(long firmID, 
				String loYearQtr, String hiYearQtr)
	{
		CumeQtrReportForm args = new CumeQtrReportForm();
		args.setFirmID("" + firmID);
		args.setHiYearQtr(hiYearQtr);
		args.setLoYearQtr(loYearQtr);
		return args;
	}

}

