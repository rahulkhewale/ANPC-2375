package org.mycompany.model;

public class Employee {
	private int employeeId;
	private int employeeSalary;
	private char employeeInitial;
	
	public Employee() { // constructor without parameter
		
	}
	
	public Employee(int eId, char eIni, int eSal) { // constructor with parameter
		employeeId = eId;
		employeeInitial = eIni;
		employeeSalary = eSal;
	
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public char getEmployeeInitial() {
		return employeeInitial;
	}

	public void setEmployeeInitial(char employeeInitial) {
		this.employeeInitial = employeeInitial;
	}
	
	
}
