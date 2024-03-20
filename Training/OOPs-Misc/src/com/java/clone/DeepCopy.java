package com.java.clone;

class Department1 implements Cloneable{
	   String deptID;
	    String deptName;
	    String deptHead;
	 
	    public Department1(String deptID, String deptName, String deptHead) {
	        this.deptID = deptID;
	        this.deptName = deptName;
	        this.deptHead = deptHead;
	    }
    
    //Default version of clone() method.
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
 
class Employee1 implements Cloneable {
    int id;
 
    String name;
    Department1 dept;
 
    public Employee1(int id, String name, Department1 dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
 
    // Overriding clone() method to create a deep copy of an object.
 
    protected Object clone() throws CloneNotSupportedException {
        Employee1 emp = (Employee1) super.clone();
        emp.dept = (Department1) dept.clone();
        return emp;
    }
}
 
public class DeepCopy {
    public static void main(String[] args) {
        Department1 dept1 = new Department1("1", "A", "AVP");
        Employee1 emp1 = new Employee1(111, "John", dept1);
        Employee1 emp2 = null;
 
        try {
            // Creating a clone of emp1 and assigning it to emp2
            emp2 = (Employee1) emp1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
 
        // Printing the designation of 'emp1'
 
        System.out.println("Dept Head of Emp1 Object: " + emp1.dept.deptHead); // Output : AVP
        System.out.println("Dept Head of Emp2 Object: " + emp2.dept.deptHead);
 
        // Changing the Dept Head of 'emp2'
 
        emp2.dept.deptHead = "Director";
 
        // This change will be reflected in original Employee 'emp1'
 
        System.out.println("Dept Head of Emp1 Object: " + emp1.dept.deptHead); // Output : Director
        System.out.println("Dept Head of Emp2 Object: " + emp2.dept.deptHead);
    }
}