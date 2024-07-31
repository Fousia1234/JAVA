package sampleproject;

public class MethodOverloading2 {
	public static void MethodOver(float r) {
		
		System.out.println("Area of circle is="+3.14*r*r);
	}
	public static void MethodOver(int length,int width) {
		System.out.println("Area of rectangle is="+length*width);
	}
	public static void MethodOver(float s,int x) {
		System.out.println("Area of square is="+s*x);
	}
	public static void main (String args[]) {
		MethodOverloading2.MethodOver(2.17f);
		MethodOverloading2.MethodOver(20,30);
		MethodOverloading2.MethodOver(2.13f,15);
	}
}
