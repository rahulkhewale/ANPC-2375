package View;
import model.Employee;
import service.EmployeeService;

public class EmployeeView {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1, 'B', 2000, 4);
		EmployeeService empService1 = new EmployeeService();
		boolean value = empService1.isEligbleForIncrement(employee1);
		if(value) {
			empService1.incrementSalary(employee1);
		}
		System.out.println(employee1.getEmployeeSalary());
	}

}
