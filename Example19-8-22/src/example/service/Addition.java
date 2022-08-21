package example.service;

public class Addition {
	
	public int add(int a){
	a++;
	return a;
		
	}
	public int add(int b, double c) {
		int d =(int) c;
		int result = b+d;
		return result;
	}
	public int add(int a, int c) {
		int result = a +c;
		return result;
	}
}
