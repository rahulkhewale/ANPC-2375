package example.view;
import example.sub.FunCar;

public class Main {
	public static void main (String[] args) {
		
		FunCar objF = new FunCar();
		System.out.println(objF.playRadio());
		System.out.println(objF.playCD());
	}

}
