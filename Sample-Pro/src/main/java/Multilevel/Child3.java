package Multilevel;

public class Child3 extends Child1{
	public void place() {
		System.out.println("my place is tvm");
	}
	public static void main(String args[]) {
		Child3 obj=new Child3();
		obj.name();
		obj.age();
		obj.place();
		
	}
}
