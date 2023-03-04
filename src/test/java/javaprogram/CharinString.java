package javaprogram;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CharinString {

	public static void main(String[] args) {

		String str="Arjun and Sachin are playing and eating and watching match";
		
		  char words []=   str.toCharArray();
		  
		          HashMap<Character, Integer>  charmap=new HashMap<Character,Integer>();
		          
		          for(Character ch:words) {
		        	  
		        	  if(charmap.containsValue(ch)) {
		        		  charmap.put(ch,charmap.get(ch)+1);
		        	  }else {
		        		  charmap.put(ch, 1);
		        	  }
		          }
		          
		       Set<Entry<Character,Integer>> set  =charmap.entrySet();
		       
		       for(Entry<Character,Integer> se:set) {
		    	   
		    	   if(se.getValue()>1) {
		    	   
		    	   System.out.println(" keys: -"+se.getKey()+" -Value-"+se.getValue());
		       }else {
		    	   System.out.println(" keys: -"+se.getKey()+" -Value-"+se.getValue());
		       }
	}
		
	}

}
