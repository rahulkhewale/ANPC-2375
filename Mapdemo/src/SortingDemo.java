import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create student array and assign student object
		Student studentArray[]= {new Student("A",12),new Student("B",7)};
		Arrays.sort(studentArray);
		for(Student s:studentArray) {
		System.out.println(s);
		}

		LinkedList<Student> list = new LinkedList<Student>();
		list.add(new Student("C",34));
		list.add(new Student("z",4));
		list.add(new Student("p",23));
		
		Collections.sort(list);
		
		System.out.println(list);
		
		StudentComparator scObj = new StudentComparator();
		Collections.sort(list,scObj);
		System.out.println(list);
	}

}
