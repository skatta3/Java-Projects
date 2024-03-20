package com.training.WebServiceClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;


public class RestJsonClientService {
	
	public static void main(String[] args) {
		RestJsonClientService client = new RestJsonClientService();


//	client.getAllUsers();		
//	client.getUser(5);
		
//		client.deleteUser(5);
//		client.getAllUsers();	
		client.createUser();
		client.getAllUsers();	
	}
	
	public void getAllUsers() {
		try {
			
		      HttpClient client = new DefaultHttpClient();
			  HttpGet request = new HttpGet("http://localhost:8081/users");
			  HttpResponse resp = client.execute(request);
			  System.out.println("Response: " + resp);
			  
			  System.out.println("Content ....." + resp.getEntity().getContent());
			  
			  BufferedReader rds = new BufferedReader (new InputStreamReader(resp.getEntity().getContent()));
			  String lines = "";
			  String respStr = "";
			  
			  System.out.println("RDS........."  + rds);
			  while ((lines = rds.readLine()) != null) {
			    System.out.println("Parsing the String with BufferedReader " + lines + "\n");
			    respStr = respStr + lines;
			  }
			  
			    JSONArray jArr = new JSONArray(respStr.toString());

		        for (int i=0; i < jArr.length(); i++) {
		            JSONObject obj = jArr.getJSONObject(i);
		            System.out.println("Users: " + obj);
		        }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void getUser(int id) {
		try {
			System.out.println("Retrieving User Information for User ID: " + id);
			
		      HttpClient client = new DefaultHttpClient();
			  HttpGet request = new HttpGet("http://localhost:8081/users/" + id);
			  HttpResponse resp = client.execute(request);
			  BufferedReader rds = new BufferedReader (new InputStreamReader(resp.getEntity().getContent()));
			  String lines = "";
			  String respStr = "";
			  while ((lines = rds.readLine()) != null) {
			    System.out.println(lines);
			    respStr = respStr + lines;
			  }
			  System.out.println("Retrieving User Information for User ID: " + id +" is Successful"  + "\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteUser(int id) {
		try {
			System.out.println("Deleting User Information for User ID: " + id);			
		      HttpClient client = new DefaultHttpClient();
			  HttpDelete request = new HttpDelete("http://localhost:8081/users/" + id);
			  HttpResponse resp = client.execute(request);
			  
			//Throw runtime exception if status code isn't 200 
			  if (resp.getStatusLine().getStatusCode() != 200) { 
			  throw new RuntimeException("Failed : HTTP error code : " + resp.getStatusLine().getStatusCode()); 
			  } 
			  
			  //Create the StringBuffer object and store the response into it. 
			  BufferedReader rds = new BufferedReader (new InputStreamReader(resp.getEntity().getContent()));
			  StringBuffer result = new StringBuffer(); 
			  String line = ""; 
			  while ((line = rds.readLine()) != null) { 
			  System.out.println("Response : \n"+result.append(line)); 
			  } 
			  System.out.println("Deleting User Information for User ID: " + id +" is Successful"  + "\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void createUser() {
		try {
			System.out.println("Creating User Information for User ID: ");
			
		      HttpClient client = new DefaultHttpClient();
			  HttpPost request = new HttpPost("http://localhost:8081/users");
			  
			  request.setHeader("Accept", "application/json");
			  request.setHeader("Content-type", "application/json");
			  
			  
			  String inputJson = "{\n" + 		  
			  "  \"name\": \"Donald\",\n" +
			  "  \"dob\": \"2000-09-09\"\n" +
			  "}";
			  
			  StringEntity stringEntity = new StringEntity(inputJson);
			  request.setEntity(stringEntity);
			  
			  HttpResponse resp = client.execute(request);
			  
			//Throw runtime exception if status code isn't 201 
			  if (resp.getStatusLine().getStatusCode() != 201) { 
			  throw new RuntimeException("Failed : HTTP error code : " + resp.getStatusLine().getStatusCode()); 
			  } 
			  
			  //Create the StringBuffer object and store the response into it. 
			  BufferedReader rds = new BufferedReader (new InputStreamReader(resp.getEntity().getContent()));
			  StringBuffer result = new StringBuffer(); 
			  String line = ""; 
			  while ((line = rds.readLine()) != null) { 
			  System.out.println("Response : \n"+result.append(line)); 
			  } 
			  System.out.println("Creating User Information is Successful"  + "\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateUser() {
		try {
			System.out.println("Updaing  User Information: ");			
		      HttpClient client = new DefaultHttpClient();
			  HttpPut request = new HttpPut("http://localhost:8081/users");
			  
			  request.setHeader("Accept", "application/json");
			  request.setHeader("Content-type", "application/json");
			  
			  
			  String inputJson = "{\n" + 		  
			  "  \"name\": \"Donald\",\n" +
			  "  \"dob\": \"200-09-09\"\n" +
			  "}";
			  
			  StringEntity stringEntity = new StringEntity(inputJson);
			  request.setEntity(stringEntity);
			  
			  HttpResponse resp = client.execute(request);
			  
			//Throw runtime exception if status code isn't 201 
			  if (resp.getStatusLine().getStatusCode() != 201) { 
			  throw new RuntimeException("Failed : HTTP error code : " + resp.getStatusLine().getStatusCode()); 
			  } 
			  
			  //Create the StringBuffer object and store the response into it. 
			  BufferedReader rds = new BufferedReader (new InputStreamReader(resp.getEntity().getContent()));
			  StringBuffer result = new StringBuffer(); 
			  String line = ""; 
			  while ((line = rds.readLine()) != null) { 
			  System.out.println("Response : \n"+result.append(line)); 
			  } 
			  System.out.println("Creating User Information is Successful"  + "\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
