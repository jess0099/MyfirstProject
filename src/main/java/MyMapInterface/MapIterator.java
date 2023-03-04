package MyMapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterator {

	public static void main(String[] args) {

		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		
		System.out.println(map.get("D"));
		
		map.forEach((k,v)->System.out.println(k+v));
	
		//iterator with keyset
		
	Iterator<String> it=map.keySet().iterator();
	
		while(it.hasNext()) {
			String key=it.next();
		int val=map.get(key);
			System.out.println(key+"key"+ "val:"+val);
		}
		//iterator with entrykey
		
		            Iterator<Entry<String,Integer>>  its  = map.entrySet().iterator();
		            while(its.hasNext()) {
		            Entry<String,Integer> tds=	its.next();
		         String K=   tds.getKey();
		         int V=tds.getValue();
		         System.out.println(K+" keys: "+V+" valus:");
		            }
	}

}
