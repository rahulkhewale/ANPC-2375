package example.sub;
import example.base.Car;

public class FunCar extends Car{
	
	public FunCar() {
		super();
	}
	public FunCar(String color, String body) {
		
		super(color,body);
	}
	public String playCD() {
		String statement ="Beautiful music is played";
		return statement;
	}
	
}
