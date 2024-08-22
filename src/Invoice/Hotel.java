package Invoice;

import java.util.Scanner;

public class Hotel  extends SVBItem{
	
	String[] hotelName = {"SVB","A2B","B2B"};
	Boolean hotelIdentifier = false;
	String FinalHotel=null;
	public void GetHotel()
	{
		System.out.println("Enter Hotel Name:" );
		for(int j=0;j<10;j++)
		{
		Scanner s = new Scanner(System.in);
		String first = s.nextLine();
		if(!first.equalsIgnoreCase("Stop"))
		{
			for(int i=0;i<hotelName.length;i++)
			{
				if(hotelName[i].equalsIgnoreCase(first))
				{
					System.out.println("Hotel Exit");
					hotelIdentifier=true;
					FinalHotel=hotelName[i];
					//invoicecalculation(ItemPrice,3);
					return;
				}
			}
			if(hotelIdentifier==false)
			{
				System.out.println("Please select the valid hotel from th below list");
				for(int i=0;i<hotelName.length;i++)
				{
					System.out.println(hotelName[i]);
				}
			}
		}
		else
		{
			break;
		}
		/*if(hotelIdentifier)
		{
			break;
		}*/
		}
		
	}
	
		A2BItem a = new A2BItem();
		public void DisplayItem()
	{
		if(hotelIdentifier && FinalHotel=="SVB")
		{
			GetItem();
		}
		else if(hotelIdentifier && FinalHotel=="A2B")
		{
			a.GetItem();
		}
		else if(hotelIdentifier && FinalHotel=="B2B")
		{
			B2BItem a1 = new B2BItem();
			a1.GetItem();
		}
	}
	
	
	public static void main(String[] args)
	{
		Hotel h = new Hotel();
		h.GetHotel();
		h.DisplayItem();
		//h.
	}

}

