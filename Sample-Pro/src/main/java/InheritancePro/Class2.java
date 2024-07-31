package InheritancePro;

public class Class2 extends Salary{
	double totalsal;
	public void totsal() {
		totalsal=basicpay+hra-pf-deduction+bonus;
	}
		public void salslip() {
			System.out.println("Basic Pay:"  + basicpay);
	        System.out.println("Deduction: " + deduction);
	        System.out.println("HRA: " + hra);
	        System.out.println("PF: "+ pf);
	        System.out.println("Bonus: " + bonus);
	        System.out.println("totalsal:"+totalsal);
		}
			public static void main(String args[]) {
				Class2 obj=new Class2();
				obj.totsal();
				obj.details();
				obj.details1();
				
			
		}
	}


