package example.base;

public class Car {

	String color;
	String body;
	
	public Car( ){
		color = "blue";
		body = "wagon";
		}

	public Car(String color, String body) {
		this.color= color;
		this.body = body;
	}
		
	public String playRadio() {
		String statement = "radio is played";
		return statement;	
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	

}
