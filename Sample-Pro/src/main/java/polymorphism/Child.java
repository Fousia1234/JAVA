package polymorphism;

public class Child extends Parent{
	public void display() {
		super.display();
		System.out.println(a-b);
	}
	public static void main(String args[]) {
		Child obj=new Child();
		obj.display();		
	}
} 
