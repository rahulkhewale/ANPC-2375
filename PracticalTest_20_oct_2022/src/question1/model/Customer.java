package question1.model;

public class Customer {
	
	private int accountNumber;
	private String accountName;
	private int accountBalance;
	
	int sum;
	
	public void createAcount(int accnumber, String accname, int accbal ) {
		
		this.accountNumber= accnumber;
		this.accountName = accname;
		this.accountBalance = accbal;
	}
	public void setAmount(int amount) {
		sum = accountBalance + amount;
	}
	public void withDrawAmount(int WdMoney) {
		int withDrawMoney = sum -500;
		System.out.println("You can withdrawal limit is"+withDrawMoney);
		int balance  = accountBalance - WdMoney;
		}
	public void getAmount() {
		System.out.println("hello"+accountName+", your account balance is 2500");
	}

}
