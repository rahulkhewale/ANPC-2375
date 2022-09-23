import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	public static void main(String[] args) {
	CopyOnWriteArrayList<Integer> cowal = new CopyOnWriteArrayList<>();
	cowal.add(23);
	cowal.add(24);
	
	System.out.println(cowal);
	
	
	
	}
}
// CopyOnWriteArrayList, CopyOnArraySet, ConcurrentHashMap, ArrayBlockingQueue
