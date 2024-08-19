package Logics;

public class accessModifier1 {

	protected int accnumber= 10101010;
	
	void PrintAccountNumber()
	{
		System.out.println(accnumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessModifier1 a = new accessModifier1();
		a.PrintAccountNumber();
	}

}
