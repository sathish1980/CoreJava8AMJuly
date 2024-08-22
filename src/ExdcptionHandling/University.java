package ExdcptionHandling;

public abstract class University {
	
	public abstract void LoginDetails();
	
	//public abstract void scholarship();
	
	public void Attendance(int days)
	{
		int hours =8;
		
		int totalHours = hours*days;
		System.out.println("You are present for "+totalHours +" Hrs");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//University U = new University();
		//U.LoginDetails();
	}

}
