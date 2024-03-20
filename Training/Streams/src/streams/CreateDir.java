package streams;

import java.io.File;
public class CreateDir {
	   public static void main(String args[]) {
		    String[] paths;
			String fileSeparator = System.getProperty("file.separator");
			String dirname = "C:" + fileSeparator+"users"+fileSeparator+"skatt"+fileSeparator+"files"+fileSeparator+"COM"+fileSeparator+"UTILS";
			File d = new File(dirname);
			  
			// Create directory now.
			d.mkdirs();
			try {      
		     // array of files and directory
	         paths = d.list();

	         // for each name in the path array
	         for(String path:paths) {
	            // prints filename and directory name
	            System.out.println(path);
	         }
	      } catch (Exception e) {
	         // if any error occurs
	         e.printStackTrace();
	      }
	   }
	}