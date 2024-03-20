

public class Employee {
	// Class level Variables(Non static) which we get for each Object that we create from this class
	int empID;
	String empName;
	String role;
	
	//Static Variables
	static String Organization;

	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

	public void responsibility(String message) {
		System.out.println("TResponsibility of the EMployee is  :  "  + message);
	}
	

	public static void main(String[] args) {
		boolean IsChecked=true;
		System.out.println("Welcome to Java Training");
		
		// Instantiating HelloWorld class
		Employee emp1 = new Employee();
		
		emp1.setEmpID(100);
		emp1.setEmpName("Cyrille");
		emp1.setRole("Developer");
		emp1.setOrganization("Google");
		
		
		// Printing Class Variables
		System.out.println("Employee ID...." + emp1.getEmpID());
		System.out.println("Employee Name...." + emp1.getEmpName());
		System.out.println("Employee Role...." + emp1.getRole());
		System.out.println("Employee Organization...." + emp1.getOrganization());
		
	
		emp1.responsibility("Developing the Code");

		Employee emp2 = new Employee();
		
		emp2.setEmpID(110);
		emp2.setEmpName("Srinivas");
		emp2.setRole("Manager");
		emp2.setOrganization("Verizon");
		
				// Printing Class Variables
				System.out.println("Employee ID...." + emp2.getEmpID());
				System.out.println("Employee Name...." + emp2.getEmpName());
				System.out.println("Employee Role...." + emp2.getRole());
				System.out.println("Employee Organization...." + emp2.getOrganization());
				
				emp2.responsibility("Reviewing and approving the Code");
		
		
	}
		


}


