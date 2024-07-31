package sampleproject;

public class StatReturn {
	public static int display() {
		int x=20;
		int y=30;
		if(x>y) {
			return x;
		}	else 
				return y;
			}
		public static void main(String args[]) {
			int z=StatReturn.display();
			System.out.println("gretest among these two number is:"+z);
		
		}
	}


