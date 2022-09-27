import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterAndForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(23,56,78,89);
		System.out.println("Printing th values greater than 70");
		
//		intList.stream().filter(num->num>70).forEach(num->System.out.println(num));
		Stream<Integer> intStream = intList.stream();
		Stream<Integer> filterStream = intStream.filter(num->num>70);
		filterStream.forEach(n->System.out.println(n));
		
		intList.stream().filter(num->num>70).forEach(System.out::println);//method referencing
		

	}

}
