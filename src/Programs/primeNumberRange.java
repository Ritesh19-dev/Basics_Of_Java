package Programs;

public class primeNumberRange 
{

	public static void main(String[] args) 
	{

		primeNumberRange obj = new primeNumberRange();
		obj.isprimeNumber();

	}

	
	//Logic
	public void isprimeNumber()
	{
		int count =0 , ctr =0;

		System.out.println("Prime Numbers are");

		for (int i = 2 ; i <= 10; i++)
		{
			int number = i;

			count = 0;


			for(int j = 1; j <=number; j++)
			{
				if(number%j==0)
				{

					count = count + 1;

				}
			}
			if (count == 2)
			{
				System.out.println(i);
				ctr = ctr + 1;
			}

		}
		System.out.println("Prime Number Count in the given range is "+ ctr);
	}

}
