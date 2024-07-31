package abstraction;

public class Class2 extends Class1 {
	public void display() {
		System.out.println("hello");
	}
	public static void main(String args[]) {
		Class2 obj=new Class2();
		obj.name();
		obj.display();
	}
}
