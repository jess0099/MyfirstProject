package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterrator {

	public static void main(String[] args) {

		Map<String,Integer> map=new HashMap<String,Integer>();
		
		  map.put("A", 1);
		  map.put("B", 2);
		  map.put("C", 3);
		  map.put("D", 4);
		  map.put("E", 5);
		  map.put("F", 6);
		  
		  System.out.println(map);
	Iterator<String> it=map.keySet().iterator();
	while(it.hasNext()) {
		String key=  it.next();
		int value=  map.get(key);
		
		System.out.println(" key: "+key+" val :"+ value);
	}
	
	                 Iterator<Entry<String,Integer>>  itr=   map.entrySet().iterator();
	                 
	                 
	                 while(itr.hasNext()) {
	                Entry<String,Integer>  bb=	  itr.next();
	                System.out.println(bb.getKey()+bb.getValue());
	                 }
		
	}

}
