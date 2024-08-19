package Invoice;

import java.util.Scanner;

public class SVBInvoice {
	
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

}
