
public class BulletMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Bullet1[] = {"National News1","National News2","National News3"};
		
		String Bullet2[] = {"InterNational News1","InterNational News2","InterNational News3"};
		
		Thread t1= new Thread(new BulletinRunnable(Bullet2),"International");
		Thread t2 = new Thread(new BulletinRunnable(Bullet1),"national");
		
		t1.start();
		t2.start();

	}

}
