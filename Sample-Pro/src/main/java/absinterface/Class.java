package absinterface;

public class Class implements Interface1{
	public static void main(String args[]) {
		Class obj=new Class();
		obj.display();
		obj.display1();
	}

	@Override
	public void display() {
		System.out.println(a+b);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display1() {
		System.out.println(a-b);
		// TODO Auto-generated method stub
		
	}
	

}
