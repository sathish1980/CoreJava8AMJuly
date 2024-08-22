package ExdcptionHandling;

public class Overloading {
	
	public void add(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b, int d)
	{
		int c= a+b+d;
		System.out.println("3 param: "+c);
	}

	public void add(int a, int b, int d, int e)
	{
		int c= a+b+d+e;
		System.out.println("4 param"+c);
	}

	public void add(double a, int b)
	{
		double c= a+b;
		System.out.println("double: "+ c);
	}
	
	public void add(double a, double b)
	{
		double c= a+b;
		System.out.println("double 2 param: "+ c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading O = new Overloading();
		O.add(4.6, 5.8);
	}

}
