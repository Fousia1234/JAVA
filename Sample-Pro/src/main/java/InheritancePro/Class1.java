package InheritancePro;

public class Class1 extends Multipro {
	public void age() {
		System.out.println("my age is 23");
	}
	public static void main(String args[]) {
		Class1 obj=new Class1();
		obj.name();
		obj.age();
	}
}
