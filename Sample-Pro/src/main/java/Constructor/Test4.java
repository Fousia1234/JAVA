package Constructor;

public class Test4 {
	int a;
	int b;
	int sum;
	int avg;
	public  void display(int a,int b) {
		sum=a+b;
		System.out.println(sum);
	}
	public void avg() {
		avg=sum/2;
		System.out.println(avg);
           
	}
	public static void main(String args[]) {
		Test4 t=new Test4();
		t.display(10,20);
		t.avg();
		
	}

}
