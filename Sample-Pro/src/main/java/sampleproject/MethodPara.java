package sampleproject;

public class MethodPara {
	public static int display(int a,int b) {
		if( a> b) {
			return a;
		}else {
			return b;
		}
	}
		public static void main(String args[]) {
			int z=MethodPara.display(10,20);
			System.out.println(z);
		}
	}


