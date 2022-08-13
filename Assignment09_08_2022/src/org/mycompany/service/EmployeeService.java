package org.mycompany.service;
import org.mycompany.model.Employee;

public class EmployeeService {
	
	 // create method as calculateSalaryIncrement
	public int calculateSalaryIncrement(Employee Obj1) {
		int salaryUp = Obj1.getEmployeeSalary()+(Obj1.getEmployeeSalary()*25)/100;
		return salaryUp;
	}

}
