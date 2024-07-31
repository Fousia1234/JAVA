package encapsulation;

public class Student {
	String name;
	int age;
	public Student(String name,int age) {
		this();
		this.name=name;
		this.age=age;
		this.display();	
	}
	public Student() {
	
		System.out.println("obsqure");
	}
		public void display() {
			System.out.println(name);
			System.out.println(age);
		}
			public static void main(String args[]) {
				Student obj=new Student("fousia",21);
				
	//obj.display();
		
		}
		
	}


