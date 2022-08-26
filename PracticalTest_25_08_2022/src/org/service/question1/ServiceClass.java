package org.service.question1;

public class ServiceClass {

	public double calculateAverage(int array[]){
		int sum = 0;
		double average;
		for (int i = 0; i<5; i++) {
			sum = sum +array[i];
		}
		
		average = sum/5;
		return average;
}

	
}