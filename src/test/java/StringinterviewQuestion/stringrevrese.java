package StringinterviewQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class stringrevrese {

	public static void main(String[] args) {

		String str="amit and baby are playing game and listening music and 10 and 10 and 10";
		
		String b="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
		 b=	b+str.charAt(i);
		}
		
		System.out.println(b);
		
		
		
		
		
		//word in string
		
		String[] words=  str.split(" ");
		
		   Map<String,Integer>   wordmap=new HashMap<String,Integer>();
		   
		   for(String word:words) {
			   
			  if(wordmap.containsKey(word)) {
				  
				  wordmap.put(word, wordmap.get(word)+1);
			  }else {
				  
				  wordmap.put(word, 1);
			  }
				   
		 }
		   
		                 Set<Entry<String,Integer>> se=  wordmap.entrySet();
		                 
		                 for(Entry<String,Integer> ss:se) {
		                	 
		                	 if(ss.getValue()>1) {
		                		 
		                		 System.out.println(" key "+ss.getKey()+" value "+ss.getValue());
		                	 }else {
		                		 System.out.println(" key "+ss.getKey()+" value "+ss.getValue());
		                	 }
		                 }
		                 
		                 
		                 //char in String
		                 
		         char [] ch= str.toCharArray();
		         
		         Map<Character,Integer> charmap=new HashMap<>();
		         
		         for(Character cc:ch) {
		        	 if(charmap.containsKey(cc)) {
		        		 charmap.put(cc, charmap.get(cc)+1);
		        	 }
		        	 else {
		        		 charmap.put(cc, 1);
		        	 }
		        	 
		         }
		
		         
		   Set<Entry<Character,Integer>>  cv= charmap.entrySet();
		   for(Entry<Character,Integer> ci:cv) {
			   if(ci.getValue()>1) {
				   System.out.println(" key "+ci.getKey()+ " value "+ci.getValue());
			   }else {
				   System.out.println(" key "+ci.getKey()+ " value "+ci.getValue()); 
			   }
		   }
		   
		
	}
	
	

}
