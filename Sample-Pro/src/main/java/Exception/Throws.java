package Exception;

public class Throws {
	int age=15;
	public void display() throws VoteException {
		if(age>=18) {
			System.out.println("eligible for voting");
		}else {
			throw new VoteException("not eligible");
		}
	}
public static void main (String args[]) throws VoteException {
	Throws obj=new Throws();
	obj.display();
	
}
}
