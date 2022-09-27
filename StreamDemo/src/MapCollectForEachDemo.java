import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapCollectForEachDemo {
	public static void main(String[] args) {
		List<String> cityName=Arrays.asList("Chennai","mumbai","Delhi","patna");
		Stream<String> cityNameStream=cityName.stream();
		Stream<Integer> cityNameLengthStream = cityNameStream.map(str->str.length());
		
		List<Integer> cityLengthList = cityNameLengthStream.collect(Collectors.toList());
		System.out.println(cityLengthList);
	}

}
