import java.util.stream.Stream;

public class DistinctForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> intStream = Stream.of(23,56,23,56,78,98);
		Stream<Integer> distinctStream = intStream.distinct();
		distinctStream.distinct().forEach(System.out::println);

	}

}
