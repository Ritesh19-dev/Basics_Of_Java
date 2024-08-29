package Programs;

public class reversePyramid {
	
	//Default Constructor
	reversePyramid() {
		int c=13;
		
		for(int i = 1; i <=7; i++)
		{
			for(int k=1; k<i; k++)
			{
				System.out.print(" ");
			}
			for(int j = c; j>=1 ; j--)
			{
				System.out.print("*");
				
			}
			
			c= c-2;
			System.out.println();
		}

	}
	
	//Main Method

	public static void main(String[] args) 
	{
		//while creating an object/instance of the class the default constructor is being called
		reversePyramid obj = new reversePyramid();
		
		
	}
	
	


}
