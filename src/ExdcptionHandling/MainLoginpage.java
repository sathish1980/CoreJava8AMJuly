package ExdcptionHandling;

import java.util.Scanner;

public class MainLoginpage {
	
	
	public void loginPage()
	{
		System.out.println("Enter login by: ");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		if(input.equalsIgnoreCase("Student"))
		{
			University S = new Strudent();
			S.LoginDetails();
		}
		else if (input.equalsIgnoreCase("Teacher"))
		{
			University S = new Teacher();
			S.LoginDetails();
		}
		else
		{
			System.out.println("You are not authorized to login in to the system");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainLoginpage M = new MainLoginpage();
		M.loginPage();
	}

}
