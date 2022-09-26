
public interface Calculations {
	int calcSquare(int x);
	default void display1() {
		System.out.println("Default display1 method");
	}
	static String greet() {
		return "Static greet method";
	}

}
