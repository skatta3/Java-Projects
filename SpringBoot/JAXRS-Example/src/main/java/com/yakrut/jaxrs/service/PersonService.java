package com.yakrut.jaxrs.service;

import com.yakrut.jaxrs.model.Person;
import com.yakrut.jaxrs.model.Response;

public interface PersonService {

	public Response addPerson(Person p);
	
	public Response deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();

}