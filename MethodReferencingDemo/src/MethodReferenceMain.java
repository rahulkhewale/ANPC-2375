
public class MethodReferenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static method referencing
		Convertible convertible =Convertible::staticMethod;
		convertible.convert();
		
		//constructor method referencing
		Convertible convertible1 =Message::new;
		convertible1.convert();
		
		//concrete method referencing
		Message message = new Message();
		Convertible convertible2 =message::greet;
		convertible2.convert();
		
		//Arbitrary method referencing
		Displayable displayable = String::toUpperCase;
		System.out.println(displayable.display("java"));
		

	}

}
