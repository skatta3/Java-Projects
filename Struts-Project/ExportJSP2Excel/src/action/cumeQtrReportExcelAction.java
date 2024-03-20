•	cumeQtrReportExcelAction.java
package gov.bls.dbes.sled.action;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.*;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import gov.bls.dbes.sled.exception.*;
import gov.bls.dbes.sled.dao.*;
import gov.bls.dbes.sled.form.*;
import gov.bls.dbes.ExcelWriter;
import gov.bls.dbes.sled.util.Firm;
import gov.bls.dbes.sled.util.HistWorksite;
import gov.bls.dbes.sled.util.HistWorksiteCrosswalk;
import gov.bls.dbes.sled.util.PropertyLookup;
import gov.bls.dbes.sled.business.BrowseForFileHelperObj;
import gov.bls.dbes.sled.business.DataResults;
import gov.bls.dbes.sled.business.DetailBusiness;
import gov.bls.dbes.sled.business.SessionInfoBusiness;

public class CumeQtrReportExcelAction extends SledAction
{
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	{
		String strutsAction = "cumeQtrReportExcel";
	    try
		{
			BrowseForFileHelperObj browseHelper = 
				new BrowseForFileHelperObj(request, true);
			// Make the second parameter true, if you want the Browse page
			// to also have a text box with the file name.
			if (!browseHelper.getStrutsAction().equals(""))
				strutsAction = browseHelper.getStrutsAction();
			CumeQtrReportExcelForm excelForm = (CumeQtrReportExcelForm) form;
			excelForm.setErrmsg("");
			excelForm.setHaveWritten("0");
			if (excelForm.getPressed() != null && excelForm.getPressed().equals("browse"))
			{
				// Save the struts path in Session state. We will need when the user
				// browses to a file:
				request.getSession(false).setAttribute("browseReturnPage", 
						"cumeQtrReportExcel");
				return (mapping.findForward("browseForFile"));
			}
			SessionInfoBusiness sledSession = 
				(SessionInfoBusiness)request.getSession().getAttribute("sledSession");
	    	if (excelForm.getFrom() != null && 
					excelForm.getFrom().equals("cumeQtrReportExcel"))  
	    	{
	    		String msg = 
	    			writeOutExcel(excelForm.getFileName(),
	    							request.getSession(), sledSession);
	    		if (!msg.equals(""))
	    		{
	    			excelForm.setErrmsg(msg);
	    			strutsAction = "cumeQtrReportExcel";  // display the error
	    		}
	    		else
	    		{
	    			excelForm.setHaveWritten("1");
	    			strutsAction = "cumeQtrReportExcel";  // Display "done" message
	    		}

	    	}
	    	else
	    		excelForm.setHaveWritten("0");
		} 
		catch (Exception e)
		{
			ShowerrorForm sfrm = new ShowerrorForm();
			sfrm.setErrmsg("ERROR in CumeQtrReportExcelAction: " + e);
			request.setAttribute("errBean", sfrm);
		    strutsAction = "showError";
		}
		return (mapping.findForward(strutsAction));
	}

	private String writeOutExcel(String fileName,
			HttpSession sess, SessionInfoBusiness sledSession)
	   throws DaoSysException, AppSvcLayerSysException
	{
		// Get data filter arguments, from the form in session scope:
		CumeQtrReportForm theForm = (CumeQtrReportForm)sess.getAttribute("cumeQtrReportArgs");
		String sFirmID = theForm.getFirmID();
		String loYearQtr = theForm.getLoYearQtr();
		String hiYearQtr = theForm.getHiYearQtr();
		SledDao dao = getDAOobjFromPool();
		
		// get the data to display:
		Vector dataVec = dao.Get_Hist_Crosswalk_For_Firm(Long.parseLong(sFirmID), 
						 loYearQtr.substring(0, 4), 
						 loYearQtr.substring(4),
						 hiYearQtr.substring(0, 4), 
						 hiYearQtr.substring(4));
		String msg = "";
		msg = outputExcelDetail(fileName, dataVec, sledSession);
		return msg;
	}

	// Return values:	"" means no problem in writing the excel file
	//					Otherwise, a message explaining the problem
	//	
	private String outputExcelDetail(String fileName, Vector psVec,
			SessionInfoBusiness sledSession)
	{
    	ArrayList resultList = new ArrayList();
    	ArrayList nameArray = new ArrayList();
    	try
    	{
    		nameArray.add("Fips");  
    		nameArray.add("Uinum");
    		nameArray.add("CrosswalkID");
    		nameArray.add("Run");
    		nameArray.add("EIN");
    		nameArray.add("Tradename");     
    		nameArray.add("StreetAddr");
    		nameArray.add("City");
    		nameArray.add("State");
    		nameArray.add("ZIP");
    		nameArray.add("cc1");
    		nameArray.add("cc2");
    		nameArray.add("cc3");
    		nameArray.add("Year");
    		nameArray.add("Qtr");
    		nameArray.add("LegalName");
    		nameArray.add("RUD");
    		nameArray.add("m1Empl");
    		nameArray.add("m2Empl");
    		nameArray.add("m3Empl");
    		nameArray.add("wages");
    		nameArray.add("comments");
    		nameArray.add("Naics");
    		nameArray.add("CountyID");
    		
        	resultList.add(nameArray);
		
        	Iterator it = psVec.iterator();
        	while (it.hasNext())
        	{
        		HistWorksiteCrosswalk hist = (HistWorksiteCrosswalk)it.next();
        		ArrayList dataArray = new ArrayList();
        		dataArray.add(hist.getExtFips());
        		dataArray.add(hist.getExtUiNum());
        		dataArray.add(hist.getCrosswalkID());
        		dataArray.add(hist.getExtRun());
        		dataArray.add(hist.getEin());
        		dataArray.add(hist.getTradeName());
        		dataArray.add(hist.getStreetAddress());
        		dataArray.add(hist.getCity());
        		dataArray.add(hist.getState());
        		dataArray.add(hist.getZip());
        		dataArray.add(hist.getCc1());
        		dataArray.add(hist.getCc2());
        		dataArray.add(hist.getCc3());
        		dataArray.add(hist.getYear());
        		dataArray.add(hist.getQtr());
        		dataArray.add(hist.getLegalName());
        		dataArray.add(hist.getRUD());
        		dataArray.add(hist.getM1Empl());
        		dataArray.add(hist.getM2Empl());
        		dataArray.add(hist.getM3Empl());
        		dataArray.add(hist.getWages());
        		dataArray.add(hist.getComments());
        		dataArray.add(hist.getNAICS());
        		dataArray.add(hist.getCountyID());
        		
        		resultList.add(dataArray);
        	}
        	ExcelWriter ew = new ExcelWriter();			
		    
			//	create header and footer string for XL header
		    String headerString = "SLED Cumulative Quarter Report - " + 
		    			sledSession.getFirmName() + " (" + sledSession.getCurrYear() + 
		    			", " + sledSession.getCurrQtr() + ")";
			//	lookup footer confidentiality stmt
		    String footerString = 
		    	PropertyLookup.getInstance().
		    		getProperty("UTILPROPERTIES", "CONFIDENTIALITY_STATEMENT");
        	ew.writeExcelFile(headerString, footerString, fileName, resultList);
    	}
    	catch (Exception e)
    	{
    		return ("" + e);
    	}	
		return "";
	}

}
