package com.java.compre;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeComparatorByIdAndName implements Comparator<EmployeeDetails> {

    @Override
    public int compare(EmployeeDetails o1, EmployeeDetails o2) {
        int flag = o1.getId() - o2.getId();
        if(flag==0) flag = o1.getName().compareTo(o2.getName());
        return flag;
    }

    public static void main(String[] args) {
		  //sorting object array
    	EmployeeDetails[] empArr = new EmployeeDetails[4];
		  empArr[0] = new EmployeeDetails(10, "Mikey", 25, 10000);
		  empArr[1] = new EmployeeDetails(20, "Arun", 29, 20000);
		  empArr[2] = new EmployeeDetails(5, "Lisa", 35, 5000);
		  empArr[3] = new EmployeeDetails(1, "Pankaj", 32, 50000);
		
		//Employees list sorted by ID and then name using Comparator class
	     //   empArr[0] = new EmployeeDetails(1, "Mikey", 25, 10000);
	        Arrays.sort(empArr, new EmployeeComparatorByIdAndName());
	        System.out.println("Employees list sorted by ID and Name:\n"+Arrays.toString(empArr));
    }
}

//public class Employee {
class EmployeeDetails {

  private int id;
  private String name;
  private int age;
  private long salary;

  public int getId() {
      return id;
  }

  public String getName() {
      return name;
  }

  public int getAge() {
      return age;
  }

  public long getSalary() {
      return salary;
  }

  public EmployeeDetails(int id, String name, int age, int salary) {
      this.id = id;
      this.name = name;
      this.age = age;
      this.salary = salary;
  }

  @Override
  //this is required to print the user-friendly information about the Employee
  public String toString() {
      return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
              this.salary + "]";
  }
}
  
