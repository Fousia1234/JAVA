package sampleproject;

public class MethodOverloading {
	public static void over(float a,int b) {
		System.out.println(a+b);
	}
	public static void over(int a,int b) {
		System.out.println (a-b);
	}
	public static void main(String args[]) {
	
		MethodOverloading.over(2.77f,10);
		MethodOverloading.over(10, 20);
	}
}

