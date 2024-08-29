package Programs;

public class reverseString {
	
	//Global variable 
	String reverse="";


	public static void main(String[] args) {
		
		
		String word = "Automation";
		
		//Creating the instance of the class
		reverseString obj = new reverseString();
		
		System.out.println(word);
		
		//Calling the method ReverseString 
		System.out.println(obj.ReverseString(word));

	}
	
	
	//Method for reversing the string without reverse()
	public String ReverseString(String wordName)
	{
		//Logic
		
		for(int i=0;i <wordName.length(); i++)
		{
			
				reverse = wordName.charAt(i) + reverse ;
			
		}
		return reverse;
	}

}
