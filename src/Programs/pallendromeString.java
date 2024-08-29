package Programs;

public class pallendromeString {

	public static void main(String[] args) 
	{
		String word = "PEEP", reverse="";
		for(int i=0;i<word.length();i++)
		{
			reverse = word.charAt(i) + reverse;
		}
		if(word.equals(reverse))
		{
			System.out.println("Pallendrome String");
		}

	}

}
