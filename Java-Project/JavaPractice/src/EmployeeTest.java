import com.training.java.Employee.EmployeeDetails;
public class EmployeeTest {

   public static void main(String args[]) {
      /* Create two objects using constructor */
//     EmployeeDetails empDetails1 = new EmployeeDetails();
	   EmployeeDetails empOne = new EmployeeDetails("James Smith");
      EmployeeDetails empTwo = new EmployeeDetails("Mary Anne");

      // Invoking methods for each object created
      empOne.empAge(26);
      empOne.empDesignation("Senior Software Engineer");
      empOne.empSalary(1000);
      empOne.printEmployee();
      empOne.service;

      empTwo.empAge(21);
      empTwo.empDesignation("Software Engineer");
      empTwo.empSalary(500);
      empTwo.printEmployee();
      
      {
    	 System.out.println("This is Anonymous Class"); 
      
      }
   }
}