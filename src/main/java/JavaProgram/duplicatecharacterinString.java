package JavaProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicatecharacterinString {

	public static void main(String[] args) {

		
		String str="I Love Lord Shiva and Shri Ram";
		
	char  tt[]=str.toCharArray();
	Map<Character,Integer> charmap=new HashMap<>();
	
	for(Character ch:tt) {
		
		if(charmap.containsKey(ch)) {
			charmap.put(ch, charmap.get(ch)+1);
		}else {
			charmap.put(ch, 1);
		}
	}
	//print key and value of hashmap
	
	  Set<Entry<Character,Integer>> set= charmap.entrySet();
	  
	  for(Entry<Character,Integer> entry:set) {
		  
		  if(entry.getValue()>1) {
			  System.out.println(entry.getKey()+"--"+entry.getValue());
		  }else {
			  
			  System.out.println(entry.getKey()+"--"+entry.getValue());
		  }
	  } 
		//using iterator
	/*
	          Iterator<Entry<Character,Integer>>  it=  charmap.entrySet().iterator();
	          while(it.hasNext()) {
	        	  
	        	Entry<Character,Integer> ee= it.next();
	        	if(ee.getValue()>1) {
	        	System.out.println(ee.getKey()+"#"+ee.getValue());
	          }else {
	        	  System.out.println(ee.getKey()+"#"+ee.getValue());
	          }
	}*/
	  
	  char c='a';
	  int count=0;
	  for(int i=0;i<str.length();i++) {
		   if(str.charAt(i)==c) {
			   count++;
		   }
	  }
	  System.out.println(c+"="+count);
	  //lambda expression
	  
	long count1=  str.chars().filter(ch->(ch==c)).count();
	System.out.println(count1);
	
	}
}
