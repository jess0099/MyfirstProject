package javaprogram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class rvrstring {

	public static void main(String[] args) {

		 String str="amit and arushi will look up meat and enjoyimg food";
		 
		String [] words=   str.split(" ");
		
		  HashMap<String, Integer>  map=new HashMap<String,Integer>();
		  
		  for(String word:words) {
			  
			  if(map.containsKey(word)) {
				  
				map.put(word, map.get(word)+1);
			  }else {
				 
				  map.put(word, 1);
				  
				  }
			  
			  
			  
		  }
		 
		  Set<Entry<String,Integer>>  set=     map.entrySet();
		  
		  for( Entry<String,Integer> se:set) {
			  
			  if(se.getValue()>1) {
				  System.out.println(se.getKey()+"->"+se.getValue());
				  
			  }else {
				  System.out.println(se.getKey()+"->"+se.getValue());
			  }
		  }
		
	}

}
