package Exception;

public class Test {
	int a=10;
	int b=0;

	public void display() {
		try {
		System.out.println(a/b);
	}
		catch(Exception e)
		{
			System.out.println("exception handled"+e);
		}
	}

	public static void main(String args[]) {
		Test obj=new Test();
		obj.display();
	}

}
