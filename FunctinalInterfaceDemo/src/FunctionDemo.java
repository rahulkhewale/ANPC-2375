import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer, String> function=(number)->{
			if(number%2==0) {
				return number+"is an even number";
				}
			else
					return number+"is an odd number";
			
			
		};
		String text = function.apply(7);
		System.out.println(text);
		
		
		Function<Integer, Integer> function1=(number)->{
			if(number%2==0) {
				return number*number;
				}
			else
					return number+number;
			
			
		};
		int square = function1.apply(7);
		System.out.println(square);
		
		
		Function<Integer, Float> function2=(number)->{
			float result = number*number;
			return result;
			
			
		};
		float square1 = function1.apply(7);
		System.out.println(square1);
	}

}
