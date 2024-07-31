package Hierarchical;

public class Child2 extends Parent1{
	public void display2() {
		System.out.println("sooper");
	}
	public static void main(String args[]) {
		Child2 obj=new Child2();
		obj.display2();
		obj.display();
		
	}

}
