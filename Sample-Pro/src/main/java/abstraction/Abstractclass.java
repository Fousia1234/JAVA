package abstraction;

public abstract class Abstractclass {
	String name;
	int age;
	public Abstractclass(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void place() {
		System.out.println("tvm");
	}
	public   abstract void  companyname();
}
