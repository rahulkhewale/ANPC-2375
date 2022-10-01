package question4.main;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		
		Stream<String> product = Stream.of("watch","mobile","laptop","speaker","TV");
		product.limit(5).forEach(System.out:: println);
		
		Stream<Integer> value = Stream.of(1000, 5000, 50000, 500, 7000);
		value.limit(5).forEach(System.out:: println);
		
		Stream<Integer> watch = Stream.of(500,200,800,1000,1200);
		Optional<Integer> maxValue = watch.max(Integer:: compare);
		System.out.println(maxValue.get());
		Optional<Integer> minValue = watch.min(Integer:: compare);
		System.out.println(minValue.get());
		
		Stream<Integer> mobile = Stream.of(5000,2000,8000,10000,12000);
		Optional<Integer> maxValue1 = watch.max(Integer:: compareTo);
		System.out.println(maxValue1.get());
		Optional<Integer> minValue1 = watch.min(Integer:: compareTo);
		System.out.println(minValue1.get());
		
		Stream<Integer> laptop = Stream.of(50000,60000,80000,90000,10200);
		Optional<Integer> maxValue2 = watch.max(Integer:: compare);
		System.out.println(maxValue2.get());
		Optional<Integer> minValue2 = watch.min(Integer:: compare);
		System.out.println(minValue2.get());
		
		Stream<Integer> speaker = Stream.of(700,200,800,900,600);
		Optional<Integer> maxValue3 = watch.max(Integer:: compare);
		System.out.println(maxValue3.get());
		Optional<Integer> minValue3 = watch.min(Integer:: compare);
		System.out.println(minValue3.get());
		
		Stream<Integer> tv = Stream.of(500,200,800,1000,1200);
		Optional<Integer> maxValue4 = watch.max(Integer:: compare);
		System.out.println(maxValue4.get());
		Optional<Integer> minValue4 = watch.min(Integer:: compare);
		System.out.println(minValue4.get());
		
		
	}

}
