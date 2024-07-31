package sampleproject;

public class Methodp {
	static int a=10;
	static int b=20;
	static int c;
		public static void add()
		{
			c=a+b;
			System.out.println("sum="+c);
			
		}
		public static void sub()
		{
			c=a-b;
			System.out.println("sub="+c);
		}
		public static void mul()
		{
			System.out.println(c=a*b);
		}
		public static void div()
		{
			System.out.println(c=a/b);
		}
		public static void main(String args[]){
			add();
			sub();
			mul();
			div();
		}

}
