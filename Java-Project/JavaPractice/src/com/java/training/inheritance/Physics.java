package com.java.training.inheritance;

public class Physics extends Faculty{
	
	Physics() {	
		super();
	}
	
	public void availability(String days) {
		
		System.out.println("Ävailable in "+ days + " of the Week");
	}
	
	public void availability(String days, String Timings) {
		
		System.out.println("Ävailable in "+ days + " of the Week from " + Timings );
	}
	
	@Override
	void does()  { //overriding method
		System.out.println("Teaching Physics Subject");
	}
	   String mainSubject = "Physics";
	   
	public static void main(String args[]){
			Physics childObj = new Physics();
		
			System.out.println(childObj.collegeName);
	//		System.out.println(childObj.getDesignation());
			System.out.println(childObj.mainSubject);
			System.out.println(childObj.getSalary());
			childObj.does();

			
			
			childObj.availability("Wednesday");
			
			childObj.availability("Wednesday", "9 AM to 10 AM");
			
		
		   }
	}