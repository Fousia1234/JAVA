package absinterface;

public class Employee implements Person{
	public static void main(String args[]) {
		Employee obj=new Employee();
		obj.department();
		obj.job();
	}

	@Override
	public void department() {
		System.out.println("L$d");

	}

	@Override
	public void job() {
		System.out.println("testing");
		// TODO Auto-generated method stub
		
	}

}
