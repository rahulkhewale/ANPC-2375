package question3;

public class SwapNumber {
	public static void main(String[] args) {
		int i = 20;
		int j = 30;
		System.out.println("first old number is"+i);
		System.out.println("second new number is"+j);
	
		
		i = j+i;
		j = i-j;
		i = i-j;
		
		System.out.println("first new number is" + i);
		System.out.println("second new number is "+ j);
	}

}
