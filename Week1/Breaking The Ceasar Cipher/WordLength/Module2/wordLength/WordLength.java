package wordLength;

import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class WordLength {
	
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
	public static int indexOfMax(int [] values) {
		int maxIndex=0;
		for(int count=0;count<values.length;count++) {
			if(values[count]>maxIndex)
			    maxIndex=values[count];
			
		}
		
		
		return maxIndex;
	}

	public static void main(String[] args) throws FileNotFoundException {
		int [] counters = {0} ;
		String [] data= {"Laer.", "My", "necessaries", "are", "embark'd.", "Farewell.",
				"And,", "sister,", "as", "the", "winds", "give", "benefit"};
		// TODO Auto-generated method stub
           int [] result =countWordLength(data, counters);
           for(int count=0;count<result.length;count++) {
        	   System.out.println(result[count]+" of length "+count);
           }
           
           System.out.println(indexOfMax(result));
	}

}
