
public class BulletinRunnable implements Runnable{
	static Bulletin bulletin = new Bulletin();
	String bulletArray[];
	
	public BulletinRunnable(String textArray[]) {
		bulletArray = textArray;
	}

	public void run() {
		bulletin.postBulletin(bulletArray);
		
	}
}
