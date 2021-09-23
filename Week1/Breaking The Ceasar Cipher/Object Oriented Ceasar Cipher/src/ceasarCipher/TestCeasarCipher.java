package ceasarCipher;

import java.io.FileNotFoundException;

public class TestCeasarCipher {
	
	public static int [] countWordLength(String [] data , int [] counts) throws FileNotFoundException {
		counts= new int[30];
		int wordLength;
		for(String word :data) {
			wordLength=0;
			for(int counter=0;counter<word.length();counter++) {
				
				if(word.charAt(0)=='"' && word.charAt(word.length()-1)=='"') {
					wordLength=word.length()-2;
				}else
				if(Character.isLetter(word.charAt(counter)) || word.charAt(counter)=='\'') {
					wordLength+=1;
				}
				
			}
			if(wordLength >=counts.length) {
				wordLength=counts.length-1;
				
			}
			if(wordLength >0)
			counts[wordLength]+=1;
		}
		return counts;
		
		
	}
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           CeasarCipher obj1= new CeasarCipher(15);
           System.out.print(obj1.encrypt("Can you imagine life WITHOUT the internet AND computers in your pocket?"));
	}

}
