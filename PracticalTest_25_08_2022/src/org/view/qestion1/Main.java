package org.view.qestion1;
import org.service.question1.ServiceClass;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ServiceClass s1 = new ServiceClass();
		int Array[]= new int[5];
		System.out.println("Enter five value :");
		
		for(int i=0;i<5;i++) {
		Array[i] = sc.nextInt();
		}
		
		System.out.println(s1.calculateAverage(Array));

	}

}
