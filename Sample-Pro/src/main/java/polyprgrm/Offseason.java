package polyprgrm;

public class Offseason extends Onseason {
public void discount() {
	super.discount();
	d=total*40/100f;
	System.out.println("discount"+d);	
}public static void main(String args[]) {
	Offseason obj=new Offseason();
	obj.total();
	obj.discount();
	
}
}
