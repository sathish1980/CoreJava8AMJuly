package Invoice;

public class EncapsulationImplementation extends Encapsulation {
	
	
	public void outcome()
	{
		age= 23;
		setAccno(123123123);
		System.out.println("My account number is : "+getAccno());
		System.out.println("My age is : "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationImplementation E = new EncapsulationImplementation();
		E.outcome();
	}

}
