package StringinterviewQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class charinString {

	public static void main(String[] args) {

		String str="Amit and akash are playing match";
		
		    char[] chars=str.toCharArray();
		    
		                  Map<Character,Integer>  charmap=new HashMap<Character,Integer>();
		                  
		                  for(Character ch:chars ) {
		                	  if(charmap.containsKey(ch)) {
		                		  charmap.put(ch, charmap.get(ch)+1);
		                	 }else {

		                		charmap.put(ch, 1); 
		                	 }
		                  }
		                  
		         Set<Entry<Character,Integer>>  se=charmap.entrySet();
		         for(Entry<Character,Integer> ee:se) {
		        	 if(ee.getValue()>1) {
		        		 System.out.println(" key "+ee.getKey()+ " value "+ee.getValue());
		        	 }else {
		        		 System.out.println(" key "+ee.getKey()+ " value "+ee.getValue());
		        	 }
		         }
		
	}

}
