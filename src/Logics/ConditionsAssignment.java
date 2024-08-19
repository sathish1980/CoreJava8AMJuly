package Logics;

public class ConditionsAssignment {
	
	public void DisplayTrafficSignal(String color,String VehicleType)
	{
		if(color=="Green")
		{
			System.out.println("you are good to go");
		}
		else if(color=="Red")
		{
			if(VehicleType=="Ambulance")
			{
				System.out.println("Please give me a Way  !! I am Ambulance");
			}
			else
			{
			System.out.println("you  have to stop");
			}
		}
		else if(color=="Orange")
		{
			System.out.println("you are about to go / stop");
		}
		else
		{
			System.out.println("Please provide valid color");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConditionsAssignment c = new ConditionsAssignment();
		c.DisplayTrafficSignal("Red","Ambulance");
	}

}
