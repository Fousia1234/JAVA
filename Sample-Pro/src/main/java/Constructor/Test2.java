package Constructor;

public class Test2 {
	int x=10;
	int y=20;
	int sum;
	public  Test2() {
		sum=x+y;
		System.out.println("Sum of two number is:"+sum);	
	}
	public static void main(String args[]) {
		Test2 t=new Test2();
	}
}
