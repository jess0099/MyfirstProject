package javaprogram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class wordinstring {

	public static void main(String[] args) {

		String str="baby and babu and nanu and nani are playing ball game and some another game";
	   
		            String words[]= str.split(" ");
		            HashMap<String,Integer>  wordmap=new HashMap<>();
		            
		            for(String word:words) {
		            	if(wordmap.containsKey(word)) {
		            		wordmap.put(word, wordmap.get(word)+1);
		            	}else {
		            		wordmap.put(word, 1);
		            	}
		            }
		            
		       Set<Entry<String,Integer>>  set=wordmap.entrySet();
		       
		       for(Entry<String,Integer> se:set) {
		    	   
		    	   if(se.getValue()>1) {
		    		   System.out.println("keys: --"+se.getKey()+"  value: --"+se.getValue());
		    	   }else {
		    		   System.out.println("keys: --"+se.getKey()+"  value: --"+se.getValue());
		    	   }
		       }
		              
		
	}

}
