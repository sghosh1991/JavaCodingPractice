package chap1;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.HashMap;


public class UniqueCharactersInString {
	
	public Boolean isUnique(String str){
		
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		StringCharacterIterator iter = new StringCharacterIterator(str);
		for(char c = iter.first(); c!=CharacterIterator.DONE; c=iter.next() ){
			
			//Character ch =  new Character(c);
			
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else
				
				map.put(c, 1);
			
		}
		
		System.out.println("Hashmap: \n " + map);
		
		for(char c = iter.first(); c!=CharacterIterator.DONE; c=iter.next() ){
			
			if(map.get(c)>1)
				return false;
			
		}
		
		
		return true;
	}


	public static void main(String args[]){
		
		UniqueCharactersInString x =new UniqueCharactersInString();
		String str="Zinyy";
		if(x.isUnique(str)){
			System.out.println(str + " is unique.");
		}
		else{
			System.out.println(str + " is not unique.");
		}
		
	}

}

