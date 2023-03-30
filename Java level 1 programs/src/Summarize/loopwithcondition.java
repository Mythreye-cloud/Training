package Summarize;

public class loopwithcondition {
	public static void main(String[] args)
	{
	
	int[] arr = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,172215,4454};
	for (int i=0;i<arr.length;i++)
	{
		if (arr[i]%2 ==0)
		{
		System.out.println(arr[i]);
		}
		else
		{
			System.out.println(0);
		}
		
	}
for (int d : arr)
{
{
	if(d%2 !=0)
	{
	System.out.println(d);
break;
	}
}
}
	
	}
}
