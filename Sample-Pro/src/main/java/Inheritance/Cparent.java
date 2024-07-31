package Inheritance;

public class Cparent extends Bparent {
	public void place() {
		System.out.println("I am from tvm");
	}

	public static void main(String[] args) {
		Cparent obj=new Cparent();
		obj.name();
		obj.age();
		obj.place();
		// TODO Auto-generated method stub

	}

}
