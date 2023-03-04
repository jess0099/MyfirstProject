package JavaProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WordinStrings {
	
	public static void main(String [] xyz) {
	
	String str="Arjun and anuj are having sandwichs and burger";
	
	               String words[]= str.split(" ");
	               
	               Map<String,Integer> wordmap=new HashMap<String,Integer>();
	               
	               for(String word:words) {
	            	   if(wordmap.containsKey(word)) {
	            		   wordmap.put(word,wordmap.get(word)+1);
	            	   }else {
	            		   
	            		   wordmap.put(word, 1);
	            	   }
	               }
	               
	                                   Set<Entry<String,Integer>>   set=wordmap.entrySet();
	                                   
	                                   for(Entry<String,Integer> ee:set) {
	                                	   
	                                	   if(ee.getValue()>1) {
	                                		   System.out.println(" key: "+ee.getKey()+" valu: "+ee.getValue());
	                                	   }else {
	                                		   
	                                		   System.out.println(" key: "+ee.getKey()+" valu: "+ee.getValue());  
	                                	   }
	                                   }
	
	}
}
