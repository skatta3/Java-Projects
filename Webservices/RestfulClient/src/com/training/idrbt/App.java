package com.training.idrbt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.web.client.RestTemplate; 

public class App implements CommandLineRunner { 
	private static final Logger log = LoggerFactory.getLogger(App.class); 
	
	public static void main(String args[]) { 
		SpringApplication.run(App.class); 
		} 
	
	public void run(String... args) throws Exception { 
		RestTemplate restTemplate = new RestTemplate(); 
		Response response = restTemplate.getForObject( "http://localhost:8081/users/1", Response.class); 
		log.info("==== RESTful API Response using Spring RESTTemplate START ======="); 
	System.out.println(response.toString()); 
		log.info("==== RESTful API Response using Spring RESTTemplate END =======");
		} 
	
}
