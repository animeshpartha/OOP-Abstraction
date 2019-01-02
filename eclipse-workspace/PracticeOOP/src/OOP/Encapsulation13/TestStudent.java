package OOP.Encapsulation13;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.setStName("Adams");
		st1.setStID(111);
		st1.setStDOB("01-01-1990");
		System.out.println("StudentInfo: " +st1.getStName()+" "+st1.getStID()+ " "+st1.getStDOB());
		
		Student st2 = new Student();
		st2.setStName("Evaa");
		st2.setStID(113);
		st2.setStDOB("01-01-1989");
		System.out.println("StudentInfo: " +st2.getStName()+" "+st2.getStID()+ " "+st2.getStDOB());
	}

}
