package JavaProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaStringProgram {
//number of occurence 
	public static void main(String[] args) {
String str="My name is amit bhati";
String word="is";

		//using tocharArray
//using charat
//lambda expression(filter)
int count=0;
char search='i';
for(int i=0;i<str.length();i++) {
	
	if(str.charAt(i)==search) {
		count++;
	}
	
	
}
System.out.println(search+":"+count);
System.out.println("######");

//

  long cont= str.chars().filter(ch->(ch==search)).count();
  System.out.println(cont);
		
  //to printout the duplicate char and number of that in string
  
  
             char Word[]=str.toCharArray();
             
             Map<Character ,Integer> charmap=new HashMap<>();
             
             for(Character ch: Word) {
            	 if(charmap.containsKey(ch)) {
            		 charmap.put(ch, charmap.get(ch)+1);
            	 }
            	 else {
            		 charmap.put(ch,1);
            	 }
             }
  
  //print the map(entryset)
             
           Set<Entry<Character,Integer>>  set=charmap.entrySet();
           for(Entry<Character,Integer> entry:set) {
        	   if(entry.getValue()>1) {
        		   System.out.println(entry.getKey()+"---"+entry.getValue());
           }
        	   else {
        		   System.out.println(entry.getKey()+"---"+entry.getValue()); 
        	   }
             }
           System.out.println("######");
           
           String strn="this is my india ";
           
        char wd[]=strn.toCharArray();
        
        Map<Character,Integer> chrmap=new HashMap<>();
        
        for(Character o:wd) {
        	
        	if(chrmap.containsKey(o)) {
        		
        		chrmap.put(o,chrmap.get(o)+1);
        	}else {
        		chrmap.put(o,1);
        	}
        	
        }
        
        //now print that hashmap by using entrysetmap
        
                  Set<Entry<Character,Integer>> ss= chrmap.entrySet();
        
                  for(Entry<Character,Integer> et:ss) {
                	  if(et.getValue()>1) {
                		System.out.println(et.getKey()+"--"+et.getValue());
                	  }else {
                		  System.out.println(et.getKey()+"--"+et.getValue());
                	  }
                  }
           
	}
}
