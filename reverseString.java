package chap1;

import java.text.StringCharacterIterator;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString x = new reverseString();
		String s= "Santosh is in SBU";
		System.out.println("Reverse of " + s + " is " + x.reverse(s));
		

	}
	
	public String reverse(String str){
	
		//StringCharacterIterator iter = new StringCharacterIterator(str);
		char [] charArray = str.toCharArray();
		for(int i=0;i<=str.length()/2;i++){
			
			int c1= (int)charArray[i];
			int c2= (int)charArray[str.length()-i-1];
			
			c1 = c1 ^ c2;
			c2 = c1 ^ c2;
			c1 = c1 ^ c2; 
			
			charArray[i]=(char)c1;
			charArray[str.length()-i-1]= (char)c2;
			
			
			
		}
		
		return new String(charArray);
		
	}
	
	

}
