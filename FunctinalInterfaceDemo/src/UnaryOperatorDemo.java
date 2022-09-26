import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> operator = num->num*2;
		int result = operator.apply(2);
		System.out.println(result);

	}

}
