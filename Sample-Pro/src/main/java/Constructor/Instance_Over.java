package Constructor;

public class Instance_Over {
public void display(float a,int b) {
	System.out.println(a+b);
}public void display(int a,int b) {
	System.out.println(a-b);
}public static void main(String args[]) {
	Instance_Over obj=new Instance_Over();
	obj.display(1.07f,20);
	obj.display(27,15);
}
}