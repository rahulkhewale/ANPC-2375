import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TerminalOperationDemo1 {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(23,56,78,98);
		Stream intStream =intList.stream();
		intStream.forEach(num->System.out.println(num));
//		intStream.forEach(num->System.out.println(num));
		
		intList.stream().forEach(num->System.out.println(num));
	}

}
