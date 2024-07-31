package sampleproject;

public class Name {
	static String s;
	static int a;
	public static void display(String name,int age) {
		  s=name;
		 a=age;  
	}
	public static void print() {
		System.out.println(s);
		System.out.println(a);
	}

			public static void main(String args[]) {
				Name.display("FOUSIA",22);
				Name.print();
			}
		}
		
	
	