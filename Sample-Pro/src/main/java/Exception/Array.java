package Exception;

public class Array {
	public static void main(String args[]) {
		try {
		int a[]=new int[2];	
		a[3]=100;
		System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception handled:"+e);
		}
		finally {
			System.out.println("unwanted exception");
		}
		
	}
}
