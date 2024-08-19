package Invoice;

import java.util.Scanner;

public class Items {

	String[] Items = {"idly","dosa","poori"};
	
	public void GetItem()
	{
		boolean ItemExist =false;
		System.out.println("Enter Item Name:" );
		Scanner s = new Scanner(System.in);
		String itemName = s.nextLine();
		for(String eachItem:Items)
		{
			if(eachItem.equalsIgnoreCase(itemName))
			{
				ItemExist=true;
				System.out.println("Item exist please enter the quatity:");
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
		Items I = new Items();
		I.GetItem();
	}

}
