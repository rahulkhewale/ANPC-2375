import java.util.function.Consumer;
import java.util.function.IntConsumer;

class ConsumerImp1 implements Consumer<String>{

	@Override
	public void accept(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}
	
}

public class ConsumerDemo {
	public static void main(String[] args) {
		ConsumerImp1 cimp1 = new ConsumerImp1();
		cimp1.accept("Welcome");
		
		
		//Syntax
		// <Inteface name><ref-variable name>= str->{   };
		Consumer<String>consumer=str->{
			System.out.println(str.toUpperCase());
		};
		consumer.accept("Hello");
		Consumer<String>consumerStr=str->{
			System.out.println(str);
		};
		consumerStr.accept("Hello");
		Consumer<Integer>consumerInt=str->{
			System.out.println(str);
		};
		consumerInt.accept(12);
	}
	IntConsumer intConsumer=i->{
		System.out.println(i);
		
	};
	intConsumer.accept(8);

}
