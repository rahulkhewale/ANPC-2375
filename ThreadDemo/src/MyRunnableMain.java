
public class MyRunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnableThread mrt = new MyRunnableThread();
		Thread t1 = new Thread(mrt,"myThread1");
		Thread t2 = new Thread(mrt,"myThread2");
		Thread t3 = new Thread(mrt,"myThread3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
