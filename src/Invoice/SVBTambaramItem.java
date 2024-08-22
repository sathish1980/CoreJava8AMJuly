package Invoice;

import java.util.Scanner;

public class SVBTambaramItem extends SVBInvoice{

	String[] Items = {"idly-50","dosa-40","poori-70"};
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
		SVBTambaramItem I = new SVBTambaramItem();
		I.GetItem();
	}

}
