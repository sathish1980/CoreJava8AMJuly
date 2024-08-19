package Logics;


import java.util.Scanner;

/*
 * Syntax : accessmodifier class classname{}
 */
public class FirstClass {
	
	/*
	 *  Methods
	 *  syntax : accessmodifier returnType MethodName(arguments/paramter){}
	 *  four type
	 *  Method without parameter/arguments
	 *  Method with parameter
	 *  Method without return type
	 *  Method with return type
	 */
	
	/*
	 * Method or method declaration
	 */
	public void Addition()
	{
		int c =10+10;
		System.out.println(c);	
	}
	
	public void addition(int firstnumber, int secondnumber)
	{
		System.out.println(name());
		int result =firstnumber+secondnumber;
		System.out.println(result);	
		int taxValue =tax();
		int totalValue = result+taxValue;
		System.out.println(totalValue);	
	}
	
	public int tax()
	{
		System.out.println("15");
		return 15;
	}
	
	public String name()
	{
		return "Sathish Kumar.R";
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  I am going to enter my Name
		 */
		/*int c= 2 /5;
		System.out.println(c);
		System.out.println("sathish kumar");
		System.out.println("Besant");
		System.out.println("Enter your name : ");
		Scanner s= new Scanner(System.in);
		String name = s.nextLine();
		System.out.println(name);
		System.out.println("Enter your mobile number : ");
		Scanner s1= new Scanner(System.in);
		int age = s1.nextInt();*/
		
		FirstClass f = new FirstClass(); 
		f.Addition(); // method call
		f.Addition();
		System.out.println("Enter your first number : ");
		Scanner s= new Scanner(System.in);
		int first = s.nextInt();
		System.out.println(first);
		System.out.println("Enter your second number : ");
		Scanner s1= new Scanner(System.in);
		int second = s1.nextInt();
		f.addition(first,second);
		f.tax();
	}

}
