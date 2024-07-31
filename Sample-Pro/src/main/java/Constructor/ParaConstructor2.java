package Constructor;

public class ParaConstructor2 {
	public ParaConstructor2(String a,char b) {
		System.out.println(a);
		System.out.println(b);
	}
	public  ParaConstructor2(float x,float y) {
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String args[]) {
		ParaConstructor2 ob=new ParaConstructor2("Hello",'S');
		ParaConstructor2 obj=new ParaConstructor2(2.17f,3.17f);
	}
	}
	
		
	

