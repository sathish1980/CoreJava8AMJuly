package Interfaceconcept;

public class BesantInvoice extends BesantTambaramInvoice implements interface1,interface2 {
	
	String[] courses= {"Python","Java","c#","SQL"};
	int courseFees =0;
	
	public void GetCourse(String course)
	{
		for(String eachCourse :courses)
		{
			if(eachCourse.equalsIgnoreCase(course))
			{
				System.out.println("Course Exist");
				courseFees =GetCourseAmount(course);
				System.out.println("Your course fees is : "+courseFees);
				//discount();
				//tax();
			}
		}
	}
	
	public int GetCourseAmount(String course)
	{
		switch(course)
		{
		case "Java":
			return 10000;
		case "Python":
			return 15000;
		case "C#":
			return 20000;
		case "SQL":
			return 12000;
		default :
			return 0;
		}
	}
	
	@Override
	public void discount() {
		
		double discountamount=0;
		double discout=0.15;
		if(courseFees>0)
		{
			discountamount = courseFees*discout;
		}
		System.out.println("Your discount amount is : "+discountamount);
	}

	@Override
	public void tax() {
		// TODO Auto-generated method stub
		double taxtamount=0;
		double taxpercentage=0.10;
		if(courseFees>0)
		{
			taxtamount = courseFees*taxpercentage;
		}
		System.out.println("Your tax amount is : "+taxtamount);
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantInvoice B = new BesantInvoice();
		B.GetCourse("SQL");
		interface2 I = new BesantInvoice();
		interface1 I1 = new BesantInvoice();
		I.discount();
		I1.discount();
		I1.tax();
	}

	@Override
	public void attendance() {
		// TODO Auto-generated method stub
		
	}

	
}
