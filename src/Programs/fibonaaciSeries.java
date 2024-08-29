package Programs;

public class fibonaaciSeries {

	public static void main(String[] args) 
	{
		int n =10 , a=0,b=1 ,sum=0;
		System.out.print(a+" "+b);
		
		for(int i =1;i<=n;i++)
		{
			sum = a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
			
		}

	}

}
