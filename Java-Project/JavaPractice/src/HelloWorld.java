

public class HelloWorld {
	// int is the data type, Number1 and Number2 are Variable names, ; is the end of the statement
	int Number1;
	int Number2;
	boolean Flag;
	public int getNumber1() {
		return Number1;
	}


	public void setNumber1(int number1) {
		Number1 = number1;
	}


	public int getNumber2() {
		return Number2;
	}


	public void setNumber2(int number2) {
		Number2 = number2;
	}


	public boolean isFlag() {
		return Flag;
	}


	public void setFlag(boolean flag) {
		Flag = flag;
	}


	public void printMessage(String message) {
		System.out.println("Testing Classes and Objects of the :  "  + message);
	}
	

	public static void main(String[] args) {
		boolean IsChecked=true;
		System.out.println("Welcome to Java Training");
		
		// Instantiating HelloWorld class
		HelloWorld helloObject = new HelloWorld();
		
		helloObject.setNumber1(10);
		helloObject.setNumber2(20);
		helloObject.setFlag(false);
		helloObject.printMessage("Created First Object");
		
		// Printing Class Variables
		System.out.println("Number1...." + helloObject.getNumber1());
		System.out.println("Number2...." + helloObject.getNumber2());
		System.out.println("Flag...." + helloObject.isFlag());

		HelloWorld helloObject1 = new HelloWorld();
		
		helloObject.setNumber1(100);
		helloObject1.setNumber2(200);
		helloObject1.setFlag(true);
		helloObject1.printMessage("Created Second Object");
		
		// Printing Class Variables
		System.out.println("Number1...." + helloObject1.getNumber1());
		System.out.println("Number2...." + helloObject1.getNumber2());
		System.out.println("Flag...." + helloObject1.isFlag());
		
		
	}
		


}


