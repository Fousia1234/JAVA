package Exception;

public class Progrm {
	public void display() {
		try {
		int a[]=new int[2];
		a[3]=100;
		System.out.println(a[2]);
	}
		catch(ArithmeticException e) {
			System.out.println("find Arithmetic exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayOutOfBounds Exception");
		}
	finally {
		System.out.println("exception handled");
	}
	}
public static void main(String args[]) {
	Progrm obj=new Progrm();
	obj.display();
}
}