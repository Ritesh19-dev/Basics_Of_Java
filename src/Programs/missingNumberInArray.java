package Programs;

import java.util.Scanner;

public class missingNumberInArray {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n,sumOfArray=0,sum=0;
		System.out.println("Enter the size of the array");
		n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter values of an array in sequence");
		
		for(int i =0;i<n-1;i++)
		{
			arr[i]= in.nextInt();
			sumOfArray = sumOfArray +arr[i];
		}
		System.out.println(sumOfArray);
		sum = (n * (n + 1)) / 2;
		System.out.println(sum);
		
		System.out.println("Missing number is "+ (sum - sumOfArray));
		

	}

}
