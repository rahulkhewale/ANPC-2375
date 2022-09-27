import java.util.Optional;
import java.util.stream.Stream;

public class MinMaxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> integerStream1 = Stream.of(56,25,54,45);
		Optional<Integer> maxOptionl = integerStream1.max(Integer:: compare);
		System.out.println(maxOptionl.get());
		
		Stream<Integer> integerStream2 = Stream.of(56,25,54,45);
		Optional<Integer> maxOption2 = integerStream2.min(Integer:: compare);
		System.out.println(maxOption2.get());
		

	}

}
