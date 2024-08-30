package Programs;

public class swapNumber {

	public static void main(String[] args) 
	{
		
		int number = 10, number2 = 30;
		
		//without using 3rd variable
		System.out.println("Approch 1 :  Without Using 3rd variable  ");
		
		System.out.println("Before swapping  ");
		System.out.println("number "+number + "  number2  "+number2);
		
		number = number + number2; // 40
		number2 = number - number2;//10
		number = number - number2;//30
		
		
		System.out.println("After swapping  ");
		System.out.println("number "+number + "  number2  "+number2  );
		
		
		
		//using 3rd variable
		
		
		
		int a = 5, b = 20 ,c;
		
		//without using 3rd variable
		
		
		System.out.println("\nApproch 2 :  Using 3rd variable  ");
		
		System.out.println("Before swapping  ");
		System.out.println("number "+a + "  number2  "+b);
		
		c=a;
		a=b;
		b=c;
		
		
		System.out.println("After swapping  ");
		System.out.println("number "+a + "  number2  "+b);

	}

}
