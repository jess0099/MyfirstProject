package javaprogram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class characterinstring {

	public static void main(String[] args) {

		String str="amit and ankur having sandwich in their laucnh time";
		
	char Char[]=str.toCharArray();
	
	     HashMap<Character,Integer> charmap=new HashMap<Character,Integer>();
	     
	     for(Character ch:Char) {
	    	 if(charmap.containsKey(ch)) {
	    		 charmap.put(ch, charmap.get(ch)+1);
	    	 }else {
	    		 charmap.put(ch, 1);
	    	 }
	     }
	     
	     Set<Entry<Character,Integer>> set=charmap.entrySet();
	     for(Entry<Character,Integer> se:set) {
	    	 if(se.getValue()>1) {
	    		 System.out.println(" Keys:--"+se.getKey()+" --Values: "+se.getValue());
	    	 }else {
	    		 System.out.println(" Keys:--"+se.getKey()+" --Values: "+se.getValue());
	    	 }
	    	 
	     }
	}

}
