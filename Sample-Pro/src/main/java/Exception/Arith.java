package Exception;

public class Arith {
	int a=10;
	int b=0;
	int c;
	public void display() {
		try {
		c=a/b;
		System.out.println("c");
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled");
		}
		finally {
			System.out.println("exception corrected");
		}
	}public static void main(String args[]) {
		Arith obj=new Arith();
		obj.display();
		
	}
	

}
