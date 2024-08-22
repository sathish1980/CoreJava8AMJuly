package Invoice;

public class Discount {
	
	private double discountPercentage =0.20;
	
	protected double getDiscount(int amount)
	{
		System.out.println("Your discount percentage is : "+discountPercentage +"%");
		double discountAmount = amount*discountPercentage;
		double actualdiscountAmount = amount- discountAmount;
		System.out.println("Your discount amount is : "+discountAmount);
		System.out.println("After discount you have to pay Rs. "+actualdiscountAmount);
		return actualdiscountAmount;
	}
	
	protected double getDiscount(int amount,double discountPercentage)
	{
		System.out.println("Your discount percentage is : "+discountPercentage +"%");
		double discountAmount = amount*discountPercentage;
		double actualdiscountAmount = amount- discountAmount;
		System.out.println("Your discount amount is : "+discountAmount);
		System.out.println("After discount you have to pay Rs. "+actualdiscountAmount);
		return actualdiscountAmount;
	}
}
