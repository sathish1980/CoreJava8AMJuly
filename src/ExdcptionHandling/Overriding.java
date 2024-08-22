package ExdcptionHandling;

public class Overriding extends Overloading{
	
	@Override
	public void add(int d,int e)
	{
		int c =e-d;
		System.out.println("sub : "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding O = new Overriding();
		O.add(2, 3);
	}

}
