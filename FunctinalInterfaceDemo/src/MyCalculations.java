
public class MyCalculations implements Calculations {
	public int calcSquare(int x) {
		return x*x;
	}
	public static void main(String[] args) {
		MyCalculations myCalculations = new MyCalculations();
		int square = myCalculations.calcSquare(2);
		System.out.println(square);
		myCalculations.display1();
		System.out.println(Calculations.greet());
		Calculations cal = new MyCalculations();
		cal.calcSquare(34);
		Calculations c = new Calculations() {

			@Override
			public int calcSquare(int x) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}

}
