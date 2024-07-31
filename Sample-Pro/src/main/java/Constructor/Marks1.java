package Constructor;

public class Marks1 {
	static int x1;
	static int x2;
	static int x3;
	static int tot;
	 static int a;
	public Marks1(int m1,int m2,int m3) {
		x1=m1;
		x2=m2;
		x3=m3;
	}
	public int display() {
		tot=x1+x2+x3;
		return tot;
	}
	public void grade() {
	if(a>=200 && a<=70) {
		System.out.println("A grade");
	}else if(a>=70 && a<=60) {
		System.out.println("B grade");
	}else if(a>=60 && a<=50) {
		System.out.println("C grade");
	}else
	{
		System.out.println("failed");
	}}
	
	public static void main(String args[]) {
		Marks1 obj=new Marks1(10,50,80);
		a=obj.display();
		System.out.println("total marks of obj=:"+a);
		obj.grade();
		Marks1 obj1=new Marks1(35,20,10);
		obj1.display();
		System.out.println("total marks of obj1=:"+a);
		obj1.grade();
	}
		
	
}
