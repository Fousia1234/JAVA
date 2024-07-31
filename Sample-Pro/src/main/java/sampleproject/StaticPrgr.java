package sampleproject;

public class StaticPrgr {
	static int a=20;
	static int b=30;
	public static void display() {
		if(a>b) {
			System.out.println("a is greatest:"+a);
		}
		else {
			System.out.println("b is greatest:"+b);
		}
	}
		public static void main(String args[]) {
			StaticPrgr.display();
		}
	}


