package Constructor;

public class Voting {
	static int age;
	public static boolean eligibleVoting(int age) {
		int minage=18;
			if(age<=minage) {
				return true;
			}
				else
				{
					return false;
				}
	}
			public static void main(String args[]) {
				Voting.eligibleVoting(20);
			}
	}
	