package com.training.json;

import com.google.gson.Gson; 

public class JsonToObject { 

	public static void main(String[] args) 
	{ 
		// Creating object of Organisation 
		Organisation org = new Organisation(); 

		// Converting json to object 
		org = getOrganisationObject(); 

		// Displaying object 
		System.out.println(org); 
	} 

	private static Organisation getOrganisationObject() 
	{ 
		// Storing preprocessed json(Added slashes) 
		String OrganisationJson = "{\n" +
			"	\"organisation_name\" : \"IDRBT\", \n" +
			"\"description\" : \"A computer Science portal for IDRBT\", \n" +
			 " \"Employee\" : \"2000\"}"; 

		// Creating a Gson Object 
		Gson gson = new Gson(); 

		// Converting json to object 
		// first parameter should be prpreocessed json 
		// and second should be mapping class 
		Organisation organisation 
			= gson.fromJson(OrganisationJson, 
							Organisation.class); 

		// return object 
		return organisation; 
	} 
} 
