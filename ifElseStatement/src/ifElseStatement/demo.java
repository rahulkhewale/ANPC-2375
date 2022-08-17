package ifElseStatement;

public class demo {
	void start() {
		System.out.println("start");
		
	}
	void displayInstruction() {
		System.out.println("displayInstruction");
	}
	void exit() {
		System.out.println("exit");
		
	}
	public static void main(String[] args) {
		int mainInput = 2;
		demo s1 = new demo();
		
		switch(mainInput) {
		case 1 : s1.start();
		break;
		case 2 : s1.displayInstruction();
		break;
		case 3 : s1.exit();
		break;
		default : System.out.println("Invalid value");
		}
	}
	

}
