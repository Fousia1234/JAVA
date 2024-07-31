package Exception;

public class Super {
	public void display() {
		try {
		int a[]= {1,2,3,4};
		System.out.println(a[10]);
	}catch(IndexOutOfBoundsException e) {
		System.out.println("exception handled");
	}
	
	}
	public static void main(String args[]) {
		Super obj=new Super();
		obj.display();
	}

}
