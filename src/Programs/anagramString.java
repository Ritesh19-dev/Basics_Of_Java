package Programs;

import java.util.Arrays;

public class anagramString {

	public static void main(String[] args) 
	{
		System.out.println(anagram("Silent","Listen"));
		
	}
		public static boolean anagram(String str1,String str2)
		{
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		
		if(str1.length()!=str2.length())
		{
			return false;
			
		}
		else
		{
			char ch[] = str1.toLowerCase().toCharArray();
			char ch2[] = str2.toLowerCase().toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch2);
			
			
			return Arrays.equals(ch, ch2);
		}
		
		


	}

}
