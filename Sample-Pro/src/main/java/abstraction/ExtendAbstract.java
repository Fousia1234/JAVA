

package abstraction;

public class ExtendAbstract extends Abstractclass {
	ExtendAbstract(String name,int age){
		super(name,age);
	}
	public void companyname() {
		System.out.println("obsqure");
	}
	public static void main(String args[]) {
		ExtendAbstract obj=new ExtendAbstract("fousia",22);
		obj.companyname();
	    obj.place();
	}

}
