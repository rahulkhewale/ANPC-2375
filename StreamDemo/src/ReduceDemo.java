import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> integerStream = Stream.of(1,2,1,2);
		Optional<Integer> op = integerStream.reduce((a,b)->a*b);
		System.out.println(op.get());
		
	}

}
