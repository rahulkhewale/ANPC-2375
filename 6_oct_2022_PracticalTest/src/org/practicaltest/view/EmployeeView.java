package org.practicaltest.view;

import java.util.HashSet;
import java.util.Scanner;

import org.practicaltest.model.Employee;
import org.practicaltest.service.EmployeeService;

public class EmployeeView {
	
	static Scanner scan=new Scanner(System.in);
	static Employee emp1=new Employee();
	static EmployeeService empService=new EmployeeService();
	
	public static void acceptEmployeeDetails() {
		System.out.println(" Enter Employee ID");
		int id=scan.nextInt();
		scan.nextLine();
		System.out.println(" Enter Employee Name");
		String name=scan.nextLine();
		System.out.println(" Enter Employee Salary");
		double salary=scan.nextDouble();
		
		Employee emp1=new Employee(id,name,salary);
		empService.addEmployee(emp1);
	}
	public HashSet<Employee> getEmployeeDetails(){
		return empService.getEmployeeDetails();
	}

}
