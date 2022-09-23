import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// all methods in executors
//		Executor executor = Executors.newSingleThreadExecutor();
//		Executor executor = Executors.newFixedThreadPool(2);
//		Executor executor = Executors.newCachedThreadPool();
		Executor executor = Executors.newScheduledThreadPool(2);
		
		
		executor.execute(new CopyTask());
//		executor.execute( new DisplayTask()); because (collable interface)
		executor.execute(new SpellcheckTask());
		executor.execute(new CopyTask());
		
		ExecutorService executorService= Executors.newCachedThreadPool();
//		executorService.submit(new DisplayTask());
//		executorService.submit(2);
		
		Future<String> futureobj = (Future<String>) executorService.submit(new DisplayTask());
		
		try {
			System.out.println(futureobj.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
