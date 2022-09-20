import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemoIteratorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm1 = new HashMap<>();
		hm1.put("python",3);
		hm1.put("c++",1);
		hm1.put("java",2);
		hm1.put( "Hibernate",4);
		System.out.println(hm1);
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(3,"ccc");
		hm.put(1, "aaa");
		hm.put(2, "bbb");
		hm.put(4, "ddd");
		System.out.println(hm);
		Set<Integer> keys = hm.keySet();
		Iterator<Integer> iterator = keys.iterator();
		while(iterator.hasNext()) {
			Integer k = iterator.next();
			System.out.println(k+":"+hm.get(k));
		}
	}

}
