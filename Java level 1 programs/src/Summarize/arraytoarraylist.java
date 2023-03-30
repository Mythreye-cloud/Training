package Summarize;

import java.util.Arrays;
import java.util.List;

public class arraytoarraylist {
	public static void main(String[] args)
	{
		String[] Name = {"Vrushi", "Vrushabh","Vrushu","Guddu","Pappa", "Puttani"};
		List<String> nameArrayList = Arrays.asList(Name);
		System.out.println(nameArrayList.contains("Vrushabh"));
		System.out.println(nameArrayList.size());
		for (int i=0; i<nameArrayList.size();i++)
		{
			System.out.println(nameArrayList.get(i));
		}
		
	}

}
