package com.java.training.Casting;

public class UpCastingDownCasting {
	public static void main(String[] args)
	{
		Fruit fruit = new Apple();
		UpCastingDownCasting updown = new UpCastingDownCasting();
		updown.caller(fruit);
		
		Fruit fruit1 = new Orange();
		updown.caller(fruit1);
		
	}
	public void caller(Fruit fruit) 
	{
		if (fruit instanceof Apple)
			fruit.methodFruit(); //Even though it is instance of Apple, we are not able to access instance of Apple
		if (fruit instanceof Orange)
			fruit.methodFruit(); //Even though it is instance of Apple, we are not able to access instance of Apple

	}
	


}

class Fruit {
	public Fruit() {
		
	}
	
	public void methodFruit()
	{
		System.out.println("Method Fruit");
	}
	
	public String toString()
	{
		return "Fruit Instance Object";
	}

	
}

class Orange extends Fruit {
	public Orange() {
		
	}
	
	public void methodFruit()
	{
		System.out.println("Method Orange");
	}
	
	public String toString()
	{
		return "Orange Instance Object";
	}
	
}

class Apple extends Fruit {
	public Apple() {
		
	}
	
	public void methodFruit()
	{
		System.out.println("Method Apple");
	}
	
	public String toString()
	{
		return "Apple Instance Object";
	}
	
}
