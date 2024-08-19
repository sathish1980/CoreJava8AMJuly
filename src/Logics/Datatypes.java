package Logics;

public class Datatypes {

	/*
	 * Datatypes
	 * 2 types
	 * Primitive
	 * Non Primitive
	 * 
	 * WholeNumber -- int or Integer
	 * decimalNumber -- double or float(not recomended)
	 * oneletter -- char
	 * word -- String
	 * TrueofFalse -- boolean
	 * 
	 * 
	 * Variable
	 * syntax:
	 * accessmodifier datatype variablename = value;
	 */
	
	
	
	static int first = 1234567890; // global or instance variable
	
	public void datatypeImplementation()
	{
		int first = 450; // local variable
		float second = 2.3f;
		double second1 = 2.3343343;
		char name = 'a';
		String course = "Java";
		Boolean Gender= true;
		
		
		System.out.println(first);
		
	}
	
	
	public void seconddata()
	{
		//int first = 345;
		System.out.println(first);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datatypes D = new Datatypes();
		D.datatypeImplementation();
		D.seconddata();
	}

}
