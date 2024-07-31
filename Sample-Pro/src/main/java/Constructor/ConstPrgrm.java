package Constructor;

public class ConstPrgrm {
	
	 int bonusmark=20;
	static int bonussalary;
	static int febinsamount=4000;
	public static void studentdetails(String StudentName,int age,int firstsemmark,char grade,int bonusmark) {
		int totalmark=bonusmark+firstsemmark;
		System.out.println(StudentName);
		System.out.println(age);
		System.out.println(firstsemmark);
		System.out.println(grade);
		System.out.println(totalmark);
	}
	public static void employeedetails(String n,int id,int jansal) {
		int totalsal=jansal+bonussalary;
		System.out.println(n);
		System.out.println(id);
		System.out.println(jansal);
		System.out.println(totalsal);
	}
	public ConstPrgrm(String carname,int janamount) {
		int totalamount=janamount+febinsamount;
		System.out.println(carname);
		System.out.println(janamount);
		System.out.println(totalamount);
		
	}
	public static void main(String args[]) {
		ConstPrgrm t=new ConstPrgrm("BMW",2500);
		t.studentdetails("Fousia",22,200,'C',500);
		t.employeedetails("salma",2,2000);
		
	}

}
