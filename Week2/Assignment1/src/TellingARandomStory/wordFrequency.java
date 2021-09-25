package TellingARandomStory;

import java.util.ArrayList;

public class wordFrequency {
    
	private  ArrayList<String> myWords;
	private  ArrayList<Integer> myFreqs;
	
	public wordFrequency() {
		myWords= new ArrayList<String>();
		myFreqs= new ArrayList<Integer>();
	}
	
	public void findUnique(String[] sentance) {
		myWords.clear();
		myFreqs.clear();
		int index,value;
		for(String word : sentance) {
			if(myWords.contains(word.toLowerCase())) {
				index=myWords.indexOf(word);
				value=myFreqs.get(index);
				myFreqs.add(index,value+1);
			
			}else {
				myWords.add(word.toLowerCase());
				myFreqs.add(1);
			}
		}
	}
	public void tester(String [] sentance) {
		
		findUnique(sentance);
		for(int counter=0;counter<myWords.size();counter++) {
		System.out.println(myWords.get(counter)+" is rpeated "+myFreqs.get(counter)+" times");
		}
	}
	
	public int findIndexOfMax() {
		int index=-1,maxValue=0;
		 for(int counter=0;counter<myFreqs.size();counter++) {
			  if(maxValue<myFreqs.get(counter)) {
				  maxValue=myFreqs.get(counter);
				  index=counter;
			  }
		 }
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                String [] words= {"My","name","is","aya","and","my","sister's","name","is","emy"};
               wordFrequency obj= new wordFrequency();
                obj.tester(words);
                
                System.out.println("The first accurrency of the max value is "+obj.findIndexOfMax());
	}

}
