package sampleproject;

public class Static {
	public static String dis() {
		String s="Hello";
		return s;
	}
	public static void main(String args[]) {
		String x=Static.dis();
		System.out.println(x);
	}

}
