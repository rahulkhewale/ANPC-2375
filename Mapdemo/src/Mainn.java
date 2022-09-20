import java.util.TreeSet;

public class Mainn {
	public static void main(String[] args) {
		Student s1 = new Student("Rahul",1);
		Student s2 = new Student("Khewale",2);
		TreeSet<Student> ts = new TreeSet<>();
		ts.add(s2);
		ts.add(s1);
		System.out.println(ts);
	}

}
