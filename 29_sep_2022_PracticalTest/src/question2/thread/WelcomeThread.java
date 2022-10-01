package question2.thread;

public class WelcomeThread implements Runnable{

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println("Welcome");
			try {
				Thread.sleep(40000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
