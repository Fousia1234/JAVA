package absinterface;

public class Class2 implements Interface1,Interface2 {
	public static void main(String args[]) {
		Class2 obj=new Class2();
		obj.display();
		obj.display1();
	}

	@Override
	public void display1() {
		System.out.println(a+b);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println(a-b);
	// TODO Auto-generated method stub
		
	}

}
