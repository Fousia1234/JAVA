package Constructor;

public class ConstOver {
	public ConstOver(int length,int width) {
		System.out.println("Area of rectangle is="+length*width);
	}
	public  ConstOver(float s,int x) {
		System.out.println("Area of square is="+s*x);
	}
	public static void  main(String args[]) {
		ConstOver t=new ConstOver(20,30);
		ConstOver t1=new ConstOver(2.1f,10);
	}
		

}
