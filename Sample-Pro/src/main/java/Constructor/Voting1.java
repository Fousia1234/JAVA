package Constructor;

public class Voting1 {
	static int age=20;
	static boolean s;
	public static boolean Age() {
			if(age>=18) {
				return true;
			}
				else
				{
					return false;
				}
	}
	public static void main(String args[]) {
		s=Voting1.Age();
		System.out.println(s);
	}

			}
	

