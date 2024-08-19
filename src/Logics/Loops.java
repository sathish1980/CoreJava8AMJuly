package Logics;

import java.util.Scanner;

public class Loops {
	
	
	public void Get5Items()
	{
		for(int itemcount=0;itemcount<5;itemcount++)
		{
		System.out.println("Enter the item: ");
		Scanner s = new Scanner(System.in);
		String eachvalue =  s.nextLine();
		}
		
	}
	
	public void Print10Number()
	{
		/*System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");*/
		for(int number=1;number<=10;number++)
		{
			
			if(number==5 || number ==9)
			{
				//break;
				continue;
			}
			System.out.println(number);
		}
	}
	
	public void Print10inReverse()
	{
		/*System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");*/
		for(int number=10;number>=1;number--)
		{
			
			/*if(number==5 || number ==9)
			{
				//break;
				continue;
			}*/
			System.out.println(number);
		}
	}

	
	public void Whileloop()
	{
		String value="Start";
		while(!value.equalsIgnoreCase("Start"))
		{
		System.out.println("Enter the item: ");
		Scanner s = new Scanner(System.in);
		String eachvalue =  s.nextLine();
		value=eachvalue;
		}
		
	}
	
	public void print10NumberusingWhile()
	{
		int number=10;
		while(number<10)
		{
			System.out.println(number);
			number=number+3;
		}
	}
	
	public void print10Numberusingdo()
	{
		int number=1;
		do
		{
			System.out.println(number);
			number=number+3;
		}while(number<10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops L = new Loops();
		L.print10Numberusingdo();
				
	}

}
