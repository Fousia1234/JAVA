package Constructor;

public class Pshop {
	static int a1,a2,a3,tot,dis, c;
public static int tot(int a1,int a2,int a3) {
	tot=a1+a2+a3;
	return tot;
}
public static void discount(int c) {
	if(c>5000) {
		dis=c*20/100;
		System.out.println(dis);
	}
	else {
		System.out.println("no discount");
	}
	
}public static void main(String args[]) {
	int c=Pshop.tot(1000,3000,2000);
	System.out.println(c);
	Pshop.discount(c);
	
}
}
