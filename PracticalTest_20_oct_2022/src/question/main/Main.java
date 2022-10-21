

package question.main;
import question1.model.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1= new Customer();
		Customer c2= new Customer();
		
		c1.createAcount(1234, "Mamta ", 500);
		c1.setAmount(2000);
		c1.getAmount();

	}

}
