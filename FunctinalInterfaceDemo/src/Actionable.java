
public interface Actionable{
	
	void jumpAction();
	void fightAction();
	default void display() {
		System.out.println("Default display method");
	}
	default void display1() {
		System.out.println("Default display1 method");
	}
	static String greet() {
		return "Static greet method";
	}
	static String greet1() {
		return "Static greet method";
	}

}
