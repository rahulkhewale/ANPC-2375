package question1.service;
import question1.model.Customer;

public class CustomerService {
	
	public boolean checkEligibility(Customer c1) {
		boolean result;
		int customer = c1.getAge();
		
		if (customer>=18) {
			
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}

}
