package Programs;

public class secondFrequentlyRepeated 
{
	//String s = "successes";
	

	public void frequent()
	{
		String s = "successes";
		int length = s.length();
		int arr[]=new int[length];
		for(int i =0; i<length; i++)
		{
			arr[i]=s.charAt(i);
		}
		
		int count = 0;
		

		
		int highest= 0, sec_highest=0;
		
		for(int i=0;i<length;i++)
		{
			count =0;
			for(int j=0;j<length;j++)
			{
				if(arr[i]==arr[j])
				{
					count ++;
				}
			}
			if(count >= highest)
			{
				highest = count ;
				sec_highest = highest;
			}
		}
		
		System.out.println(sec_highest);
			
	}
	public static void main(String[] args) 
	{
		secondFrequentlyRepeated obj = new secondFrequentlyRepeated();
		obj.frequent();

	}

}
