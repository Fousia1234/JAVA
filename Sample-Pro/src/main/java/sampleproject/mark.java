package sampleproject;

public class mark {
	public static void main(String args[]) {
		int mark=58;
		if(mark<40)
		{
			System.out.println("Failed");
	}
		else if(mark>=40 && mark<=60)
		{
			System.out.println("D Grade");
		}
		else if(mark>=60 && mark<=70)
		{
			System.out.println("C Grade");
		}
		else if(mark>=71 && mark<=80)
		{
			System.out.println("B Grade");
		}
		else if(mark>81 && mark<=100)
		{
			System.out.println("A grade");
		}

}
}
