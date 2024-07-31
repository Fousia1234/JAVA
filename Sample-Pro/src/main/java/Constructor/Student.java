package Constructor;

public class Student {
	String name1;
	int id1;
	String place1;
	static String compname="obsqure";
	public Student(String name,int id,String place) {
		name1=name;
		id1=id;
		place1=place;
	}
	public void display() {
		System.out.println(name1);
		System.out.println(id1);
		System.out.println(place1);
		System.out.println(compname);
	}
		
	public static void main(String args[]) {
		Student obj=new Student("Fousia",1,"tvm");
		obj.display();
	Student obj1=new Student("salma",2,"kollam");
	obj1.display();
	Student obj2=new Student("devika",3,"ernakulam");
	obj2.display();
	Student obj3=new Student("harsha",4,"wayanad");
	obj3.display();
	Student obj4=new Student("gopika",5,"attingal");
	obj4.display();

		
		
		
		
		
	}

}
