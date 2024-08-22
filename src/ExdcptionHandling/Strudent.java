package ExdcptionHandling;

public class Strudent extends University{
	
	public void LoginDetails()
	{
		System.out.println("Welcome Student");
	}
	
	public static void main(String[] args)
	{
		University S = new Strudent();
		S.LoginDetails();
	}

}
