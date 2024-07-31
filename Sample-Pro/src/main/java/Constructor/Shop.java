package Constructor;

public class Shop {
	static int p1,p2,p3,tot,dis,c;
	public static int tot(int p1,int p2,int p3)
	{
		tot=p1+p2+p3;
		return tot;
	}
	public static void discount(int c)
	{
		if(c>=5000)
		{
			dis=c*20/100;
			System.out.println("Discount="+dis);
		}
		else
		{
			System.out.println("no discount");
		}
	}
public static void main(String args[])
{
	int c=Shop.tot(2000,2000,1400);
	System.out.println("Total amount="+c);
	Shop.discount(c);
}
}
