
public class Bulletin {
	synchronized void postBulletin(String bulletPoints[]) {
		// synchronized(this){ }
		for(String bullet:bulletPoints) {
			System.out.println(bullet);
			try{
				Thread.sleep(5000);
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			}
		}
	

}
