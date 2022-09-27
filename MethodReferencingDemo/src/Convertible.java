
public interface Convertible {
	default void defaultMethod() {
		System.out.println("Default method");
	}
	static void staticMethod() {
		System.out.println("Static method");
	}
	void convert();

}
