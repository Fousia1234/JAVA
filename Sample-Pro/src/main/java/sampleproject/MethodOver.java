package sampleproject;

public class MethodOver {
	public static void dispaly(float length,int width) {
		System.out.println(length*width);
	}
	public static void display(int s,int x) {
		System.out.println(s*x);
	}
	public static void main(String args[]) {
		MethodOver.dispaly(2.17f,10);
		MethodOver.display(20, 30);
	}

}
