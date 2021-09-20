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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//           int key;
//           int index;
//           StringBuilder encrpytedMessage = new StringBuilder("");
//           Scanner input= new Scanner(System.in);
//           System.out.println("Please Enter The Key");
//           key=input.nextInt();
//           String enc=alphabet.substring(key);
//           enc=enc+alphabet.substring(0,key);
//         //  System.out.println(enc);
//           String message;
//           System.out.println("Please Enter The Message");
//           message ="At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
//         
//           
//           for(int counter=0;counter<message.length();counter++) {
//        	 
//        	  index=alphabet.indexOf(Character.toUpperCase(message.charAt(counter)));
//        	  if(index!=-1) {	 
//        		  encrpytedMessage.insert(encrpytedMessage.length(), enc.charAt(index));
//        	  }else
//        	  {if(Character.isWhitespace(message.charAt(counter))==true)
//        		  encrpytedMessage.insert(encrpytedMessage.length(), new String(" "));
//        	  else
//        		  encrpytedMessage.insert(encrpytedMessage.length(), message.charAt(counter));
//        		 
//        	  }
//           }
//           System.out.print(encrpytedMessage);
	

		System.out.println(encrypt("a bAt", 19));
		
	}

}
