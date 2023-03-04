package MyMapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMap1 {

	public static void main(String[] args) {

		//#doubly link node
		
		//# nodes are interconnected with each other
		//# Insertion ,not synchronized #
		
		Map<String,Integer> map1=new LinkedHashMap<>();
		map1.put("Amit", 100);
		map1.put("sumit",300);
		map1.put("bikash", 500);
		map1.put("rithik", 200);
		map1.put("Punit", 400);
		
		System.out.println(map1);
		
		       Iterator<Entry<String,Integer>> it= map1.entrySet().iterator();
		       
		       while(it.hasNext()) {
		    	  Entry<String,Integer> ll= it.next();
		    	  
		    	  System.out.println("key: "+ll.getKey()+"  Values:"+ll.getValue());
		       }
		       
		       
		       Map<String,Integer> map2=new HashMap<>();
		       map2.put("Amit", 100);
				map2.put("sumit",300);
				map2.put("bikash", 500);
				map2.put("rithik", 200);
				System.out.println("============");
	//System.out.println(map2);
				           Iterator<String>  jk =map2.keySet().iterator();
				           while(jk.hasNext()) {
				        	 String key= jk.next();
				        	 int value= map2.get(key);
				        	 System.out.println(" key:"+key+" value:"+value);
				        	 
				           }
				           
				           map2.forEach((e,v)->System.out.println(e));
	
	}

}
