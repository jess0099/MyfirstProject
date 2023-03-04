package JavaProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicatewordinstring {

	public static void main(String[] args) {

		
		String str="I love my desh and country and me and my family and my god";
		String find="my";
		                  String words[]=str.split(" ");
		                  
		                  Map<String,Integer> wordmap=new HashMap<>();
		                   for(String word:words) {
		                	  if(wordmap.containsKey(word)) {
		                		  wordmap.put(word, wordmap.get(word)+1);
		                	  }else {
		                		  wordmap.put(word, 1);
		                	  }
		                  }
		                  
		                  //hashmap value
		                  
		                             Set<Entry<String,Integer>>  entry=  wordmap.entrySet();
		                      //for a particular word       
		                            /* for(Entry<String,Integer> ee:entry) {
		                            	 if((ee.getValue()>1) && (ee.getKey().contains(find))) {
		                            		 System.out.println(ee.getKey()+"="+ee.getValue());
		                            	 }
		                            	 
		                             }*/
		
		                             for(Entry<String,Integer> ee:entry) {
		                            	 if(ee.getValue()>1) {
		                            		 System.out.println(ee.getKey()+"="+ee.getValue());
		                            	 }else {
		                            		 System.out.println(ee.getKey()+"="+ee.getValue());
		                            	 }
	}
		                             
		                             //reverse the string
		                             System.out.println("----------------------");
		                             String rev="";
		                             for(int i=str.length()-1;i>=0;i--) {
		                            	 rev=rev+str.charAt(i);
		                             }System.out.println(rev);
	}
}
