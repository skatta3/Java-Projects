package com.java.training.encapsulation;

public class EmployeeDetails {

    public int ssn;
    private String empName;
    private int empAge;
    private float salary = 1000;

    public float getSalary() {
		return salary;
	}

	private void setSalary(float salary) {
		this.salary = salary;
	}

	//Getter and Setter methods
    public int getEmpSSN(){
        return ssn;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
        ssn = newValue;
    }

}
