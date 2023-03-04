package javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class findoutthestringfromanotherstring {

	public static void main(String[] args) {
  
		String str="Amit and jess and Sherlin and ayra and ruby are playing games";
		String find="and";
		   String words[]=str.split(" ");
		   
		   Map<String,Integer> wordmap=new HashMap<>();
		   for(String word:words) {
			   
			   if(wordmap.containsKey(word)) {
				
				   wordmap.put(word, wordmap.get(word)+1);
			   }else {
				   wordmap.put(word,1);
			   }
		   }
		   
                                          Set<Entry<String,Integer>> set= wordmap.entrySet();
                                          
                                          for(Entry<String,Integer> ss:set) {
                                        	  
                                        	  if((ss.getValue()>1)) {
                                        		  System.out.println(ss.getKey()+"--"+ss.getValue());
                                        	  }
                                        	else {
                                        		  System.out.println(ss.getKey()+"--"+ss.getValue());
                                        	  }
                                          }
		
	}

}
