package encapsulation;

public class ATM {
	private int pin;
	public void setter(int pin) {
		this.pin=pin;
	}
	public void validpin() {
		if(pin==1001) {
			System.out.println("withdraw amount");
		}
		else if(pin==1234) {
			System.out.println("withdraw amount");
		}
		else if(pin==1212) {
			System.out.println("withdraw amount");
		}
		else
		{
			System.out.println("wrong pin number");
			
		}
		
	}public void getter() {
		System.out.println(pin);
	}

}
