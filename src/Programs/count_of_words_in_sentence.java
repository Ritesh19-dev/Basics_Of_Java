package Programs;

public class count_of_words_in_sentence 
{

	public static void main(String[] args) 
	{
		String word = "Future is Automation" , newWord="";
		word = word +" ";
		int count =0;
		//Approach 1
		
		
		for(int i =0;i<word.length();i++)
		{


			if(word.charAt(i) != ' ')
			{
				newWord = newWord + word.charAt(i);
				continue;

			}
			count++;
		}
		System.out.println("Numer of word in a sentence is = " + count);
		
		
		
		
		
		//Appraoch 2
		
		/*
		  int a=0;
		for(int i =0;i<word.length();i++)
		{


			if(word.charAt(i) == ' ')
			{
				newWord = word.substring(a,i);
				a=i ;
				count++;
			}
			
			
		}
		System.out.println("Numer of word in a sentence is = " + count);
		*/	
	}
}
			