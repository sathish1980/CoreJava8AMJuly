package Logics;


import java.util.Scanner;

/*
 * Syntax : accessmodifier class classname{}
 */
public class ConstructorClass {
	
	/*
	 *  Constructor
	 *  syntax : accessmodifier  ConstructorName(arguments/paramter){}
	 *  ConstructorName should be same as your class name
	 *  2 Types
	 *  Constructor with out parameter /arguments
	 *  Contructor with parameter / arguments
	 *  
	 */
	
	/*
	 * Method or method declaration
	 */
	
	/*public ConstructorClass()
	{
		int dob = 2000;
		int currentYear= 2024;
		int result = currentYear-dob;
		System.out.println("You age is : "+result);
	}*/
	
	public ConstructorClass(int dob, int currentyear)
	{
	//	int dob = 2000;
	//	int currentYear= 2024;
		int result = currentyear-dob;
		System.out.println("You age is : "+result);
	}
	
	
	public void Addition()
	{
		int c =10+10;
		System.out.println(c);	
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorClass f = new ConstructorClass(1990,2024); 
		f.Addition();
	}

}
