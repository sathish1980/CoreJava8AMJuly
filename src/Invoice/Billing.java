package Invoice;

import java.util.Scanner;

public class Billing extends Discount{
	
	void getAmount()
	{
		System.out.println("Enter the Amount: ");
		Scanner getAmountFromUser = new Scanner(System.in);
		int actualAmount = getAmountFromUser.nextInt();
		System.out.println("You have entered the amount is: " +actualAmount);
		double AfterDiscount =getDiscount(actualAmount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Billing B = new Billing();
		B.getAmount();
	}

}
