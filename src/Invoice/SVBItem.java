package Invoice;

import java.util.Scanner;

public class SVBItem extends SVBInvoice{

	String[] Items = {"idly-10","dosa-20","poori-30"};
	int ItemPrice=0;

	public void GetItem()
	{
		boolean ItemExist =false;
		System.out.println("Enter Item Name:" );
		Scanner s = new Scanner(System.in);
		String itemName = s.nextLine();
		for(String eachItem:Items)
		{
			String[] aftersplit = eachItem.split("-");
			if(itemName.equalsIgnoreCase(aftersplit[0]))
			{
				ItemExist=true;
				System.out.println("Item exist please enter the quatity:");
				ItemPrice=Integer.parseInt(aftersplit[1]);
				int totalQuantity = GetQuantity();
				invoicecalculation(ItemPrice,totalQuantity);
				break;
			}
		}
		if(ItemExist==false)
		{
			System.out.println("Item doesnot exist please select the item from below list");
			for(String eachItem:Items)
			{
				System.out.println(eachItem);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SVBItem I = new SVBItem();
		I.GetItem();
		//SVBInvoice S = new SVBInvoice();
		//I.invoicecalculation();
	}

}
