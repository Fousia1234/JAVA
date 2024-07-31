package Exception;

public class Test1 {
	int a=10;
	int b=0;
	public void display() {
		try {
		System.out.println(a/b);
	}
		catch(Exception e) {
			System.out.println("statement executed");
		}
		finally {
			System.out.println("exception handled");
		}
	}
	public static void main(String args[]) {
		Test1 obj=new Test1();
		obj.display();
	}
}
