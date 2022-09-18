package org.practicaltest.question3;
class Customer{  
void custInfo() {
	
} 
}  
class GEC implements BE{  
public void course(){System.out.println("GEC");}  
   
}  
class Gondwana extends GEC{
	public void course() {
		System.out.println("Gondwana")
	}
}
class Main{
	public static void main(String args[]){  
		Gondwana g = new Gondwana();
		g.course();
		 }
}