package ceasarCipher;

public class CeasarCipher {
       private static String alphabet;
       private static String shiftedAlphabet;
       
       public CeasarCipher(int key) {
    	   alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	   shiftedAlphabet=alphabet.substring(key)+alphabet.substring(0,key);
       }
       
       public static String encrypt(String message) {
    	   StringBuilder encrpytedMessage = new StringBuilder("");
  		 int index;
  		
           for(int counter=0;counter<message.length();counter++) {
          	 
         	  index=alphabet.indexOf(Character.toUpperCase(message.charAt(counter)));
         	  if(index!=-1) {	 
         		  encrpytedMessage.insert(encrpytedMessage.length(), shiftedAlphabet.charAt(index));
         	  }else
         	  {if(Character.isWhitespace(message.charAt(counter))==true)
         		  encrpytedMessage.insert(encrpytedMessage.length(), new String(" "));
         	  else
         		  encrpytedMessage.insert(encrpytedMessage.length(), message.charAt(counter));
         		 
         	  }
            }
  		return encrpytedMessage.toString();
       }
}
