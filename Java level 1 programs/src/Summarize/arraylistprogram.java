package Summarize;

import java.util.ArrayList;

public class arraylistprogram {
	public static void main(String[] args)
	{
		ArrayList<String> A = new ArrayList<String>();
		A.add("      &");
		A.add("     &&&");
		A.add("    &&&&&");
		A.add("   &&&&&&&");
		A.add("  &&&&*&&&&");
		A.add(" &&&&&&&&&&&");
		A.add("&&&&&&&&&&&&&");
		System.out.println(A.get(6));
		System.out.println(A.contains("  &&&&*&&&&"));
		for (int i=0;i<A.size();i++)
		{
			System.out.println(A.get(i));
		}
	}

}
