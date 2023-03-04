package JavaProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class findchinstring {
//this program is about to find char in a string  and 
	public static void main(String[] args) {

		String str="Amit and akash  are doing there work";
		
		 char word[]=    str.toCharArray();
		 
		Map<Character,Integer>  charmap=new HashMap<>();
		 
		 for(Character ch:word) {
			 if(charmap.containsKey(ch)) {
				 charmap.put(ch, charmap.get(ch)+1);
			 }else {
				 charmap.put(ch, 1);
			 }
			 
		 }
		 
		   Set<Entry<Character,Integer>>  set=  charmap.entrySet();
		   
		   for(Entry<Character,Integer> ss:set) {
			   if(ss.getValue()>1) {
				   System.out.println("keys: "+ss.getKey()+"  value:"+ss.getValue());
			   }else {
				   System.out.println("keys: "+ss.getKey()+"  value:"+ss.getValue());
			   }
				   
		   }
		
	}

}
