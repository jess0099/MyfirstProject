package JavaProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class wordinstring {

	public static void main(String[] args) {

		String str="100 200 100 200 1000 HI" ;
		
		
		
	String word[]=str.split(" ");
	
	Map<String,Integer> wordmap=new HashMap<>();
	
	for(String c:word) {
		
		if(wordmap.containsKey(c)) {
			
			wordmap.put(c, wordmap.get(c)+1);
		}else {
			
			wordmap.put(c,1);
		}
	}
		
	 Set<Entry<String,Integer>>  entry= wordmap.entrySet();
	 
	 for( Entry<String,Integer> o:entry) {
		 
		 if(o.getValue()>1) {
			 System.out.println(o.getKey()+"--"+o.getValue());
		 }else {
			 System.out.println(o.getKey()+"--"+o.getValue());
		 }
		 
	 }
	}

}
