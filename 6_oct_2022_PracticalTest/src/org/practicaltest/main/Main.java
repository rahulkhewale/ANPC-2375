package org.practicaltest.main;

import org.practicaltest.view.DepartmentView;
import org.practicaltest.view.EmployeeView;

public class Main {
	public static void main(String[] args) {
		
		EmployeeView.acceptEmployeeDetails();
		System.out.println();
		System.out.println("Employee Added Successully");
		DepartmentView.acceptDepartmentDetails();
		System.out.println();
		System.out.println("Department Added Successully");
		
	}

}
