package abstraction;

public class Student1 extends Student {
	public void company() {
		System.out.println("obsqure");
	}
	public void name() {
		System.out.println("fousia");
	}
	public static void main(String args[]) {
		Student1 obj=new Student1();
		obj.place();
		obj.company();	
		obj.name();
	}
}
