package price;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile price[]=Mobile.values();
		for(int i=0;i<price.length;i++)
			System.out.println(price[i]+" :--> "+price[i].printPrice()+" Rs");
		
		System.out.println();//for next line or Space...
		// enhanced for loop
		for(Mobile price2:Mobile.values())
			System.out.println(price2+" :--> "+price2.printPrice()+" Rs");

	}

}
