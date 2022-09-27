import java.util.stream.Stream;

public class LImitForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stringStream = Stream.of("Java", "c","c++","ruby");
		stringStream.limit(4).forEach(System.out:: println);

	}

}
