package encapsulation;

public class Name1 {
	private String name;
	private int age;
	private int rollno;
	public void setter(String name,int age,int rollno) {
		this.name=name;
		this.age=age;
		this.rollno=rollno;
	}
	public void getter() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(rollno);
	}

}
