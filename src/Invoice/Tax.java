package Invoice;

public class Tax {
	
	private double taxPercentage =0.13;
	
	protected double getTax(int amount)
	{
		System.out.println("Your tax percentage is : "+taxPercentage +"%");
		double taxAmount = amount*taxPercentage;
		double actualtaxAmount = amount+ taxAmount;
		System.out.println("Your tax amount is : "+taxAmount);
		System.out.println("After tax you have to pay Rs. "+actualtaxAmount);
		return actualtaxAmount;
	}
	

}
