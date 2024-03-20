package com.java.clone;

class Department {
    String deptID;
    String deptName;
    String deptHead;
 
    public Department(String deptID, String deptName, String deptHead) {
        this.deptID = deptID;
        this.deptName = deptName;
        this.deptHead = deptHead;
    }
}
 
class Employee implements Cloneable {
    int id;
    String name;
    Department dept;
 
    public Employee(int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
 
    // Default version of clone() method. It creates shallow copy of an object.
 
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
 
public class ShallowCopy {
 
    public static void main(String[] args) {
        Department dept1 = new Department ("1", "A", "AVP");
        Employee emp1 = new Employee (111, "John", dept1);
        Employee emp2 = null;
 
        try {
            // Creating a clone of emp1 and assigning it to emp2
             emp2 = (Employee) emp1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
 
        // Printing the Depat Head of 'emp1'
 
        System.out.println("Dept Head of Emp1 Object: " + emp1.dept.deptHead); // Output : AVP
        System.out.println("Dept Head of Emp2 Object: " + emp2.dept.deptHead);
 
        // Changing the Dept Head of 'emp2'
 
        emp2.dept.deptHead = "Director";
 
        // This change will be reflected in original Employee 'emp1'
 
        System.out.println("Dept Head of Emp1 Object: " + emp1.dept.deptHead); // Output : Director
        System.out.println("Dept Head of Emp2 Object: " + emp2.dept.deptHead);
    }
}