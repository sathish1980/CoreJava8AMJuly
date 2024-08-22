package ExdcptionHandling;

public class Teacher extends University{
	public void LoginDetails()
	{
		System.out.println("Welcome Teacher");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University U = new Teacher();
		U.LoginDetails();
	}

}
