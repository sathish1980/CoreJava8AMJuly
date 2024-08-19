package Logics;

public class Conditions {
	
	int a=10;
	
	public void CheckMyName(String name, int age , int income,int dob,String color)
	{
		if(name=="Sathish" && age>30 && income>10000 && dob >1990)
		{
			if(dob>1990)
			{
				if(color=="Black")
				{
					System.out.println("Welcome Sathish");
				}
			}
		}
		else if (name == "Raja" || age >40)
		{
		System.out.println("Welcome Raja");	
		}
		else if (!(name == "Nirmal" && age>20))
		{
		System.out.println("Welcome Nirmal");	
		}
		else
		{
			System.out.println("You are not in our database . please do register with us");
		}
	}
	
	
	public void GetGender(String code)
	{
		switch(code)
		{
		case "M":
			System.out.println("You are Male");
			break;
		case "F":
			System.out.println("You are Female");
			break;
		case "T":
			System.out.println("You are transgender");
			break;
		default:
			System.out.println("please provide valid code");
			break;
		}
	}
	public static void main(String[] args)
	{
		Conditions c = new Conditions();
		c.GetGender("F");
	}

}
