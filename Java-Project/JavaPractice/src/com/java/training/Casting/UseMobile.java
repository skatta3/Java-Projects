package com.java.training.Casting;

public class UseMobile {
	public static void main(String[] args)
	{
		Samsung s = new Samsung();
		
	// Upcasting - 	
		Mobile mob = (Mobile) s;
		mob.calling();
		Mobile mob1 =  s;  //Upcasting
		mob1.calling();
		Mobile mob2 = new Samsung();
		mob2.calling();
	// Upcasting
		
		
	/**
	 * Downcasting is used more frequently than upcasting. Use downcasting when we 
	 * want to access specific behaviors of a subtype.	
	 */
		
		Mobile mob3 = new Motorola();
		
		Motorola moto =	(Motorola) mob3;  //Downcasting, Explicit Narrowing
		
		moto.calling();
		
		
		
	}

}

class Mobile {
	void calling() {
		System.out.println("Calling");
	}
}

class Samsung extends Mobile {
	void calling() {
		System.out.println("Calling from Samsung Mobile");
	}
}

class Motorola extends Mobile {
	void calling() {
		System.out.println("Calling from Motorola Mobile");
	}
}

class OnePlus extends Mobile {
	void calling() {
		System.out.println("Calling from OnePlus Mobile");
	}
}
