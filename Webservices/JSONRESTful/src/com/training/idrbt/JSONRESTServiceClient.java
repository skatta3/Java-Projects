package com.training.idrbt;

	import java.io.BufferedReader;
	import java.io.FileInputStream;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.net.URL;
	import java.net.URLConnection;
	 
	import org.json.JSONObject;
	 
	
	public class JSONRESTServiceClient {
		public static void main(String[] args) {
			String string = "";
			try {
	 
				// Step1: Let's 1st read file from fileSystem
				InputStream JSONInputStream = new FileInputStream("C:\\Trainings\\IDRBT\\API_Dev\\jsonRest.txt");
				InputStreamReader JSONReader = new InputStreamReader(JSONInputStream);
				BufferedReader br = new BufferedReader(JSONReader);
				String line;
				while ((line = br.readLine()) != null) {
					string += line + "\n";
				}
	 
				JSONObject jsonObject = new JSONObject(string);
				System.out.println(jsonObject);
	 
				// Step2: Now pass JSON File Data to REST Service
				try {
					URL url = new URL("http://localhost:8080/JSONRESTful/api/jsonRestService");
					URLConnection connection = url.openConnection();
					connection.setDoOutput(true);
					connection.setRequestProperty("Content-Type", "application/json");
					connection.setConnectTimeout(5000);
					connection.setReadTimeout(5000);
					OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
					out.write(jsonObject.toString());
					out.close();
	 
					BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	 
					while (in.readLine() != null) {
					}
					System.out.println("\nJSON REST Service Invoked Successfully..");
					in.close();
				} catch (Exception e) {
					System.out.println("\nError while calling JSON REST Service");
					System.out.println(e);
				}
	 
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
