package StringinterviewQuestion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WORDinString {

	public static void main(String[] args) {

		String str="ANIL AND SUNIL AND SATISH AND PINTU ARE BROTHER";
		String [] words=str.split(" ");
		
		 Map<String,Integer>  wordmap=new HashMap<>();
		 
		 for(String word:words) {
			 
			 if(wordmap.containsKey(word)) {
				 wordmap.put(word, wordmap.get(word)+1);
			 }else {
				 wordmap.put(word, 1);
			 }
		 }
		         Set<Entry<String, Integer>>   set=wordmap.entrySet();
		         
		         for(Entry<String,Integer> ee:set) {
		        	 if(ee.getValue()>1) {
		        		 System.out.println("keys: "+ee.getKey()+ " value"+ee.getValue());
		        	 }else {
		        		 System.out.println("keys: "+ee.getKey()+ " value"+ee.getValue()); 
		        	 }
		        	 
		         }
		
	}

}
