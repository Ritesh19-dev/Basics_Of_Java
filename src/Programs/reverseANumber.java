package Programs;

public class reverseANumber 
{

	public static void main(String[] args) 
	{
		int number = 123456789, rev=0,denom;
		
		System.out.println("Orginal number  ="+ number);
		
		while(number>0)
		{
			denom = number%10;
			rev = rev*10 +denom;
			number = number /10;
			
		}
		
		System.out.println("reverse number  ="+ rev);
		
		
		
		// using StringBuffer class
		
		int num=8494;
		
		System.out.println("Orginal number  ="+ num);
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev1 =sb.reverse();
		
		System.out.println("reverse number  ="+ rev1);

	}
	
	

}
