package Constructor;

public class ParaConstructor {
	public ParaConstructor(String a,char b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String args[]) {
		ParaConstructor ob=new ParaConstructor("Hello",'S');
	}

}
