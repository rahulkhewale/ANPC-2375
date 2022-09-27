import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class SourceStreamDemo {
	public static void main(String[] args) {
		Stream<Integer> integerStream1 = Stream.of(1,2,3,4,5,6);
		Stream<String> integerStream10 = Stream.of("java","hibernet","Spring","Angular");
		
		Integer integerArray[]= {23,456,67,89,98};
		Stream<Integer> integerStream2= Arrays.stream(integerArray);
		
		List<String> stringList =new LinkedList<>();
		stringList.add("English");
		stringList.add("Hindi");
		
		Stream stringSteam2 = stringList.stream();	}

}
