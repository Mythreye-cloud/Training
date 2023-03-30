package Summarize;

public class diamond {

	public static void main(String[] args)
	{
		String[] arr  = {"                 *","                ***","               *****","              *******","             *********","              *******","               *****","                ***","                 *"};
				for (int i=0;i<arr.length;i++)
		
		{
			System.out.println(arr[i]);
		}
				// enhanced for loop
				for(String s:arr)
				{
					System.out.println(s);
				}
	}
}
