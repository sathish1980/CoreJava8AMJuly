package Logics;

public class Accesmodifier2 extends accessModifier1{
	
	protected int age =20;

	protected void GetAccountNukber()
	{
		//accessModifier1 a1 = new accessModifier1();
		//System.out.println(a1.accnumber);
		System.out.println(accnumber);
		PrintAccountNumber();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accesmodifier2 a = new Accesmodifier2();
		a.GetAccountNukber();
	}

}
