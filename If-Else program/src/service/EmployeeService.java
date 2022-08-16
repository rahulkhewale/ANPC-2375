package service;
import model.Employee;

public class EmployeeService {
	private int a = 78;
	public void incrementSalary(Employee e) {
		int salary = e.getEmployeeSalary();
		int newSalary = salary + 5000;
		e.setEmployeeSalary(newSalary);
	}
	public boolean isEligbleForIncrement(Employee e) {
		boolean result = false;
		int exp = e.getExperience();
		if (exp >2)
		{
			result = true;
		
		}
		else
		{
			result = false;
		}
		return result;
		
	}
	public void display() {
		
	}

}
