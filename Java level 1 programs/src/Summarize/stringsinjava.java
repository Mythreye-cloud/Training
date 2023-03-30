package Summarize;

public class stringsinjava {
	public static void main(String[] args)
	{
		String h = "I will succeed";
		
		String h1 = "I will succeed";
	String h2 = new String ("I will succeed");
	//h will be the object but h1 will be pointing to h only as the string is the same for all the objects
	// h2 will create a new object even if the same string is seen, as new is mentioned
	//We can define strings in 2 ways, literals and new object as seen in above example
	
	
	// SPlit and print horizontally
	String[] split = h.split("will");
	System.out.println(split[0]);
	System.out.println(split[1]);
	System.out.println(split[1].trim());
	
	for (int i=0; i<h.length();i++)
	{
		System.out.println(h.charAt(i));
		
	}
	
	//Spliot and print reverse
	for (int i=h.length()-1; i>=0;i--)
	{
		System.out.println(h.charAt(i));
		
	}
	
	}

}
