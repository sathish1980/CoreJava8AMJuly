package Logics;

import java.util.Scanner;

public class Arrays {
	
	int[] price = {10,100,200,300,400,500,600};
	String[] items=new String[10];
	
	int[][] values = {{1,2,3,7,8},
					  {4,5,6,9,10},
					  {11,12,14,13}};
	
	String[][] items2=new String[2][5];
	
	public void arrayimplementation()
	{
		System.out.println(price.length);
		
		for(int i=0;i<price.length;i++)
		{
			System.out.println(price[i]);
		}
		
		int count=0;
		for(String eachvalue :items)
		{	
			System.out.println("Enter your item: ");
			Scanner s = new Scanner(System.in);
			String value = s.nextLine();
			items[count]=value;
			count=count+1;
			//System.out.println(eachvalue);
		}
		// items[0]="Rice";
		
		for(String eachvalue :items)
		{
			System.out.println(eachvalue);
		}
	}
	
	
	public void twodimension()
	{
		//System.out.println(values[0][2]);
		System.out.print("[ ");
		for(int i=0;i<values.length;i++) // get the row
		{
			for(int j=0;j<values[i].length;j++)
			{
				
				System.out.print(values[i][j]);
				System.out.print(",");
			}
			System.out.println("");
			
		}
		System.out.print(" ]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays A = new Arrays();
		A.twodimension();
	}

}
