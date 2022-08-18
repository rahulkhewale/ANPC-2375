package question1.view;
import question1.service.CustomerService;
import question1.model.Customer;

public class CustomerView {
	
	
	public static void main(String[]args) {
		Customer objC = new Customer(1, "Rahul", 20);
		CustomerService objCS = new CustomerService();
		boolean value = objCS.checkEligibility(objC);
		if(value == true) {
			System.out.println("you are eligible for voting");
		}
		else {
			System.out.println("you are not eligible for voting");
		}
	}
}