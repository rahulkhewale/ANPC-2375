package question2.thread;

public class ThankYouThread implements Runnable{

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
			System.out.println("Thank You");
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
