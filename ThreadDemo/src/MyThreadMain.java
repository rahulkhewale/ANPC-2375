
public class MyThreadMain {
	public static void main(String[] args)throws Exception {
		MyThread mt1 = new MyThread();
		mt1.start();
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().join();
		System.out.println("Main method ends");
	
	}

}
