package com.training.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heart;
	public Human() {
		
	}
	
	@Autowired // Constructor
	public Human(Heart heart) {
		this.heart = heart;
	}

//	@Autowired //Setter, looks for byType then byName
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startPumping() {
		if(heart != null)
			heart.pump();
		else
			System.out.println("Please consult Doctor");
	}

}
