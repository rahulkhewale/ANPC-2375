package example.view;
import example.service.Addition;

public class Main {

 public static void main(String[] args) {
	 Addition A1 = new Addition();
	 int s1 = A1.add(10);
	 double s2 = A1.add(20, 12.88);
	 int s3 = A1.add(10, 30);
	 
	 System.out.println(s1);
	 System.out.println(s2);
	 System.out.println(s3);
	 
 }
}
