package sampleproject;

public class Prgrm {
	static int a;
	static int b;
	static int c;
	static int avg;
	public static void add (int a,int b) {
		c=a+b;
		System.out.println(c);
	}
	
		public static int avg()
		{
			avg=c/2;
			return avg;
		}
	
	public static void main(String args[]) {
	  Prgrm.add(10,20);
	  int x=Prgrm.avg();
	  System.out.println(x);
		}
		
	}


