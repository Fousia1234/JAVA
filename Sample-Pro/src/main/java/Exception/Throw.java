package Exception;

public class Throw {
	public void display() {
		int age=10;
		if(age>18) {
			System.out.println("eligible for voting");		
		}else {
			
			throw new ArithmeticException("not eligible for voting");
			}
		
	}public static void main(String args[]) {
		Throw obj=new Throw();
		obj.display();
	}
}
