import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
	public int compare(Student student1, Student student2) {
		String s1 = student1.getName();
		String s2 = student2.getName();
		return s1.compareTo(student2.getName());
		//return student1.getname().compareTo(student2.getName());
	}

	
}
