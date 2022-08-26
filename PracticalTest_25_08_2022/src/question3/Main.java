package question3;

public class Main {
	int ugcount=0;
	int pgcount = 0;
	int degreeCount = 0;
	
	void countObj(Degree ...degreeobj) {
		for(Degree obj : degreeobj) {
			if (obj instanceof Postgraduate)
				pgcount++;
			else
			{
				if (obj instanceof Undergraduate)
					ugcount++;
				else 
					degreeCount++;
			}
		}
		System.out.println("the name of UG object:"+ugcount);
		System.out.println("the name of PG object:"+pgcount);
		System.out.println("the name of Degree object:"+degreeCount);
		
		
	}
	public static void main(String[]args) {
		Degree deg = new Degree();
		Undergraduate ug = new Undergraduate();
		Postgraduate pg = new Postgraduate();
		Degree deg1 = new Degree();
		Undergraduate ug1 = new Undergraduate();
		Postgraduate pg1 = new Postgraduate();
		Main countobj1 = new Main();
		countobj1.countObj(deg,ug,pg,deg1,ug1,pg1);
		
		
		
	}
	
	

	

}