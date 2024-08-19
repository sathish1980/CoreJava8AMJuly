package ExdcptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class ExecptionHandle {
	
	
	public void add() throws ArithmeticException,IOException
	{
		int a= 10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void div()
	{
		//try
		//{
		System.out.println("Enter first Number:" );
		Scanner s = new Scanner(System.in);
		int first = s.nextInt();
		System.out.println("Enter Second Number:" );
		Scanner s1 = new Scanner(System.in);
		int second = s1.nextInt();
		//if(second>0)
		//{
		int result = first/second;
		System.out.println("Output is : "+result);
		/*}
		else
		{
			System.out.println("You have enterd 0 in the second value");
		}
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("You have entere incorrect value");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("you hve enterd in to finally");
		}*/
	}
	
	public void GetAge(int dob)
	{
		if(dob<1990)
		{
			System.out.println("sathish");
			throw new NullPointerException("You are lesser than 1990");
		}
	}
	
	public static void main(String[] args) throws ArithmeticException,IOException
	{
		ExecptionHandle E = new ExecptionHandle();
		E.div();
		E.add();
	}

}
