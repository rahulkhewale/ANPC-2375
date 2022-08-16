package model;

public class Employee {
	private int employeeId;
	private char employeeInitial;
	private int employeeSalary;
	private int experience;
	
	public Employee() {
		
	}
	public Employee(int empId, char empInitial, int empSal,int empExperience ) {
		employeeId = empId;
		employeeInitial = empInitial;
		employeeSalary = empSal;
		experience = empExperience;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public char getEmployeeInitial() {
		return employeeInitial;
	}
	public void setEmployeeInitial(char employeeInitial) {
		this.employeeInitial = employeeInitial;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

}
