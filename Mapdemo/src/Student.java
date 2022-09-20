
public class Student implements Comparable<Student>{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public int compareTo(Student obj) {
		int val=0;
		if(this.age==obj.age)
			val=0;
		else
			val=this.age>obj.age?1:-1;
			
		return val;
		
	}
	

}
