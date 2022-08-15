package org.mycompany.view;
import org.mycompany.model.Employee;
import org.mycompany.service.EmployeeService;

public class EmployeeView {
	public static void main(String[] args) {
		Employee Employee1 = new Employee(120,'s',10000);
		EmployeeService EmployeeS1 = new EmployeeService();
		int value = EmployeeS1.calculateSalaryIncrement(Employee1);
		System.out.println(value);
		System.out.println("old salary" + Employee1.getEmployeeSalary());
		System.out.println("Employee ID: " + Employee1.getEmployeeId());
		System.out.println("Employee Initial : " + Employee1.getEmployeeInitial());

		
	}

}
