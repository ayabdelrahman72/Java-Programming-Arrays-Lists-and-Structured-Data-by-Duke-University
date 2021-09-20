package courseraTranslatingIntoCode;

import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class CeasarCipher {
         
	public static String encrypt(String message,int key) {
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 StringBuilder encrpytedMessage = new StringBuilder("");
		 int index;
		 String enc=alphabet.substring(key);
         enc=enc+alphabet.substring(0,key);
         for(int counter=0;counter<message.length();counter++) {
        	 
       	  index=alphabet.indexOf(Character.toUpperCase(message.charAt(counter)));
       	  if(index!=-1) {	 
       		  encrpytedMessage.insert(encrpytedMessage.length(), enc.charAt(index));
       	  }else
       	  {if(Character.isWhitespace(message.charAt(counter))==true)
       		  encrpytedMessage.insert(encrpytedMessage.length(), new String(" "));
       	  else
       		  encrpytedMessage.insert(encrpytedMessage.length(), message.charAt(counter));
       		 
       	  }
          }
		return encrpytedMessage.toString();
	}
	public static StringBuilder EncryptionUsingTwoKeys(String message,int key1,int key2) {
		   String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		   StringBuilder encryptedMessage= new StringBuilder("");
		   int index;
		   //this is a shifted Alphabet using key1
		   String shiftedAlphabetUsingKey1=alphabet.substring(key1)+alphabet.substring(0,key1);
		   
		 //this is a shifted Alphabet using key2
		   String shiftedAlphabetUsingKey2=alphabet.substring(key2)+alphabet.substring(0,key2);
		   for(int counter=0;counter<message.length();counter++) {
			   index=alphabet.indexOf(Character.toUpperCase(message.charAt(counter)));
			   if(index!=-1) {
			   if((counter+1)%2==0) {
				   encryptedMessage.insert(encryptedMessage.length(),shiftedAlphabetUsingKey2.charAt(index));
				   System.out.println(message.charAt(counter)+" to "+encryptedMessage.charAt(counter));
			   }else {
				   encryptedMessage.insert(encryptedMessage.length(),shiftedAlphabetUsingKey1.charAt(index));
				   System.out.println(message.charAt(counter)+" to "+encryptedMessage.charAt(counter));
			   }
		   }else
		       	  {if(Character.isWhitespace(message.charAt(counter))==true)
		       		  encryptedMessage.insert(encryptedMessage.length(), new String(" "));
		       	  else
		       		  encryptedMessage.insert(encryptedMessage.length(), message.charAt(counter));
		       		 
		       	  }
		   }
		   
		   
		   return encryptedMessage;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		System.out.println(encrypt("a bAt", 19));
		System.out.println(EncryptionUsingTwoKeys("First Legion", 19));
		
		
	}

}
