package com.java.json;


// Program for print data in JSON format.
public class JavaJsonEncoding {
	public static void main(String args[])
	{
		// In java JSONObject is used to create JSON object
		// which is a subclass of java.util.HashMap.

		JSONObject file = new JSONObject();

		file.put("Full Name", "Ritu Sharma");
		file.put("Roll No.", Integer.valueOf(1704310046));
		file.put("Tuition Fees", Double.valueOf(65400));

		// To print in JSON format.
		System.out.print(file);
	}
}
