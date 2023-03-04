package javaprogram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class duplicatewordsString {

	public static void main(String[] args) {

		
		String str="arjun and akash are team player are the opened";
		
		char ch[]=   str.toCharArray();
		
		    HashMap<Character, Integer> charmap=new HashMap<Character,Integer>();
		    
		    for(Character cc:ch) {
		    	
		    	if(charmap.containsKey(cc)) {
		    		charmap.put(cc, charmap.get(cc)+1);
		    	}else {
		    		charmap.put(cc, 1);
		    	}
		    }
		    
		    Set<Entry<Character,Integer>> set = charmap.entrySet();
		    
		    for(Entry<Character,Integer> se:set) {
		    	if(se.getValue()>1) {
		    		System.out.println("-key--"+se.getKey()+"--value--"+se.getValue());
		    	}else {
		    		System.out.println("-key--"+se.getKey()+"--value--"+se.getValue());
		    	}
		    }
		    System.out.println("#######################");
		    
	                      String words[]=str.split(" ");
	                      HashMap<String, Integer> wordmap=new HashMap<String,Integer>();
	                      
	                      for(String word:words) {
	                    	  if(wordmap.containsKey(word)) {
	                    		  wordmap.put(word, wordmap.get(word)+1);
	                    	  }else {
	                    		  wordmap.put(word,1);
	                    	  }
	                      }
	                      
	                             Set<Entry<String,Integer>>   sen=wordmap.entrySet();
	                             for(Entry<String,Integer> ss:sen) {
	                            	 if(ss.getValue()>1) {
	                            		 System.out.println("-key--"+ss.getKey()+"--value--"+ss.getValue());
	                            	 }else {
	                            		 System.out.println("-key--"+ss.getKey()+"--value--"+ss.getValue());
	                            	 }
	                             }
	}

}
