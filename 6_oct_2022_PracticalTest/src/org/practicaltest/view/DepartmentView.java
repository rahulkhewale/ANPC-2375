package org.practicaltest.view;


import java.util.HashSet;
import java.util.Scanner;

import org.practicaltest.model.Department;
import org.practicaltest.service.DepartmentService;

public class DepartmentView {
	
	static Scanner scan=new Scanner(System.in);
	static Department department=new Department();
	static DepartmentService departmentService=new DepartmentService();
	
	public static void acceptDepartmentDetails() {
		System.out.println(" Enter Department Id");
		scan.nextLine();
		System.out.println(" Enter Department Name ");
		System.out.println(" Enter Purchase Number of Employee ");
		Department department1=new Department();
		departmentService.addDepartment(department1);
	}
	public HashSet<Department> getEmployeeDetails(){
		return departmentService.getDepartmentDetails();
	}

}
