package Programs;

public class secondLargestNumberInArray 
{
	//Logic to find the second largest number in array 
	public void secondLargest(int arr[])
	{
		int largest = arr[0];
		int seclarg =0 ;
		
		for(int i = 1; i < arr.length; i++ )
		{
			if(arr[i] >= largest )
			{
				
				seclarg = largest;
				largest = arr[i];
			}
		}
		
		System.out.println("secondlargest number in an array is "+seclarg);
	}

	public static void main(String[] args) 
	{
		int arr[] = { 46, 32, 19, 11, 38, 56, 14 }; 
		secondLargestNumberInArray obj = new secondLargestNumberInArray();
		obj.secondLargest(arr);

	}

}
