package wordPlay;

public class WordPlay {

	
	
	public static boolean isVowel(char ch) {
		char chInLowerCase=Character.toLowerCase(ch);
		if(chInLowerCase=='a' || Character.toLowerCase(ch)=='e' || Character.toLowerCase(ch)=='o'
				||Character.toLowerCase(ch)=='i'|| Character.toLowerCase(ch)=='u') {
		return true;
		}
		return false;
		
	}
	public static String replaceVowel(String phrase ,char ch) {
		for(int counter =0;counter<phrase.length();counter++) {
			if(isVowel(phrase.charAt(counter)))
			{
				phrase=phrase.substring(0,counter)+ch+phrase.substring(counter+1);
			}
		}
		return phrase.toString();
	}
	public static String emphasize(String phrase,char ch) {
		char changedChar;
		for(int counter =0;counter<phrase.length();counter++) {
			if(Character.toLowerCase(phrase.charAt(counter))== Character.toLowerCase(ch)) {
			if(counter%2== 0)
				changedChar='*';
			else
				changedChar='+';
			phrase=phrase.substring(0,counter)+changedChar+phrase.substring(counter+1);
			}
			
		
			
	}
		return phrase.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(isVowel('o'));
         System.out.println(replaceVowel("aya", '*'));
         System.out.println(emphasize("Mary Bella\r\n"
         		+ "Abracadabra", 'a'));
	}

}
