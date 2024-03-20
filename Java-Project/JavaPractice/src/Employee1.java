/** Accessing Instance Variables and Methods **/


public class Employee1 {
	int age;
	static organization;
	
	public Employee1 (String name) {
		System.out.println("Choosen  Name is    " + name);
	}
	
	public void setAge(int empAge) {
		String empName;
		this.age = empAge;
	}
	
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		 /* Object creation */
		Employee1 emp = new Employee1("Srinivas");
		
		/* Call class method to set Employee's age */
		emp.setAge(26);
		
		/* Call another class method to get Employee's age */
		emp.getAge( );
		
		/* You can access instance variable as follows as well */
		System.out.println("Employee Age :" + emp.age );
	   }
		
}
