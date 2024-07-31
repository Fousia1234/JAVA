package Constructor;

public class Test5 {
	int a;
	int b;
	int sum;
	int avg;
	public void display(int a,int b) {
		sum=a+b;
		System.out.println(sum);
	}
	public void avg() {
		avg=sum/2;
		System.out.println(avg);
	}
	public static void main(String args[]) {
		Test5 obj=new Test5();
		obj.display(10,20);
		obj.avg();
		
	}

}
