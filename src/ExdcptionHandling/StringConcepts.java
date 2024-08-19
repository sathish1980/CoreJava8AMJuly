package ExdcptionHandling;

public class StringConcepts {
	
	String name =" Besant Technologya tambaram chennai";
	String course1="Java";
	String course2="Python";
	String val="";
	
	String filename = "sathish.json";
	
	public void stringimplementation()
	{
		System.out.println(name);
		System.out.println(name.length());
		char[] charvalue = name.toCharArray();
		for(char eachvalue : charvalue)
		{
			System.out.println(eachvalue);
		}
		System.out.println(name.indexOf("athi"));
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.charAt(10));
		System.out.println(name.trim());
		System.out.println(name.replace(" ", "_"));
		String name1=name.replace(" ", "_");
		System.out.println(name1);
		System.out.println(course1.equals(course2));
		System.out.println(course1.equalsIgnoreCase(course2));
		System.out.println(course1.compareTo(course2));
		System.out.println(course1==course2);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.contains("Tambaram"));
		System.out.println(name.startsWith(" Besant"));
		System.out.println(name.endsWith("chennai"));
		System.out.println(name.substring(7,11));
		System.out.println(name.substring(7));
		System.out.println(course1+course2);
		System.out.println(course1.concat(course2));
		byte[] value = name.getBytes();
		for(byte eachvale : value)
		{
			System.out.println(eachvale);
		}
		System.out.println(val.isEmpty());
		System.out.println(name.isBlank());
		String[] aftersplit = name.split("am");
		for (String eachv : aftersplit)
		{
			System.out.println(eachv);
		}
		int[] age= {50,30};
		for(int eachvale : age)
		{
		String newAge = String.valueOf(eachvale);
		}
		//System.out.println(newAge);
		System.out.println(name.repeat(5));
		//name.format(name1, aftersplit)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConcepts s = new StringConcepts();
		s.stringimplementation();
	}

}
