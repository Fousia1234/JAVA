package InheritancePro;

public class Salary extends Employee {
	double hra;
	double pf;
	public void details1() {
		hra = 0.05 * basicpay; 
        pf = 0.2 * basicpay; 
	}

}
