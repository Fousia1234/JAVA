package sampleproject;

public class Sample2 {
	static int x;
	static int z;
		public static void display(int a,int b) {
	         x=a;
	         z=b;
		}
		public static void add() {
			int s=x+z;
			System.out.println(s);
					
		}
		public static void sub() {
			int r=x-z;
			System.out.println(r);
		}
		public static void main(String args[])
		{
			Sample2.display(10,20);
			Sample2.add();
			Sample2.sub();
		}
						
	}

