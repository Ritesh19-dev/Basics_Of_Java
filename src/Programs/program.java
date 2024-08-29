package Programs;

public class program {

	public static void main(String[] args) {
		
		//declaring array 1
		int arr[] = {1,3,5,7,9};
		
		//declaring array 2
		int arr2[] = {2,4,6,8,10};
		
		//finding length of the array to create a new array to store the values of both the arrays
		
		int totalLength= arr.length + arr2.length;
		
		//printing the length of both the array
		System.out.println("Total Length of the Array = "+totalLength);
		
		//initializing the new array with a size of the total length.
		
		int finalArray[] = new int[totalLength];
		
		int c=0,ctr=0;
		
		
		//Logic 
		for (int i=0; i<totalLength; i++)
		{
			if(i%2==0)
			{
				finalArray[i]=arr[ctr];
				ctr++;
			}
			else 
			{
				finalArray[i]=arr2[c];
				c++;
			}
		}
		
		
		//Printing the Final Array
		System.out.println("Final Array");
		for (int i=0; i<totalLength; i++)
		{
			System.out.print(finalArray[i]);
		}
	}
}
		

