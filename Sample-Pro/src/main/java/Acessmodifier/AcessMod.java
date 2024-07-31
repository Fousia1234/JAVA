0.package Acessmodifier;

public class AcessMod {
	public void display()
	{
		System.out.println("Hello");
	}
	private void display1()
	{
		System.out.println("add");
	}
	protected void display2()
	{
		System.out.println("sub");
	}
	void display3()
	{
		System.out.println("div");
	}
	public static void main(String args[]) {
		AcessMod obj=new AcessMod();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();
	}

}
