package stringPrograms;

public class swapStringUsingSubstring {

	public static void main(String[] args) {
		
		
		String word="Automation", word2="Tester";
		
		word = word + word2;
		
		word2 =word.substring(0,word.length() - word2.length());
		word = word.substring(word2.length());
				
		System.out.println(word+" "+word2);
	}

}
