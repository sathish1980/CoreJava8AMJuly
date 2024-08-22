package Invoice;

import java.util.Scanner;

public class SVBInvoice extends Discount{
	
	public int GetQuantity()
	{
		System.out.println("Enter Item quantity:" );
		Scanner s = new Scanner(System.in);
		int itemQTY = s.nextInt();
		return itemQTY;

	}
	
	public void invoicecalculation(int amount, int qty)
	{
		//int discount=10;
		int totalmoaunt = amount*qty;
		System.out.println("You have to pay Rs. "+(totalmoaunt));
	}

	@Override
	protected double getDiscount(int amount)
	{
		double discountPercentage=0.10;
		System.out.println("Your discount percentage is : "+discountPercentage +"%");
		double discountAmount = amount*discountPercentage;
		double actualdiscountAmount = amount- discountAmount;
		System.out.println("Your discount amount is : "+discountAmount);
		System.out.println("After discount you have to pay Rs. "+actualdiscountAmount);
		return actualdiscountAmount;
		
	}
	
}
