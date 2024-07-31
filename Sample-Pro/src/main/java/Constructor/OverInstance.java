package Constructor;

public class OverInstance {

	public void display(float a,int b) {
		System.out.println(a+b);
	}public void display(int a,int b) {
		System.out.println(a-b);
	}public void display(int a,int b,int c) {
		System.out.println(a*b*c);
	}
	public static void main(String args) {
		OverInstance obj=new OverInstance();
		obj.display(2.17f, 10);
		obj.display(10, 20);
		obj.display(10,20,30);
		}
}


