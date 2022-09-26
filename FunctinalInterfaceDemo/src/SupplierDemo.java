import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		//Supplier interface in java
		Supplier<String> supplierString = ()->"Supplier String";
		String str =supplierString.get();
		
		Supplier<Integer> supplierInt = ()->{return 17;};
		int i = supplierInt.get();
		
		Supplier<MyCalculations> supplierMyCalc = ()->{return new MyCalculations();};
		MyCalculations myCal = supplierMyCalc.get();
		
		//predicate interface in java
		Predicate<Integer> lesserthan = j -> (j < 18); 
		  
        // Calling Predicate method
        System.out.println(lesserthan.test(10));
        
        Predicate<Integer>  predicate= (age) -> (age < 18); 
        boolean result1= predicate.test(60);
        System.out.println(result1);
        
        Predicate<Integer>  predicate1= (age) -> (return true); 
        boolean result2= predicate1.test(60);
        System.out.println(result2);
        
		
	}

}
