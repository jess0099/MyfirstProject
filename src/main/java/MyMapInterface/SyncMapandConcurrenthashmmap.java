package MyMapInterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class SyncMapandConcurrenthashmmap {

	public static void main(String[] args) {

		//synchronizedmap
		Map<String,Integer> map1=new HashMap<>();
		
		Map<String,Integer> syn=Collections.synchronizedMap(map1);
		syn.put("Amit", 1);
		syn.put("sumit", 2);
		syn.put("punit", 3);
		System.out.println(syn);
		System.out.println("=======");
		System.out.println(syn.get("punit"));
		
		Iterator<Entry<String, Integer>>   it=syn.entrySet().iterator();
		while(it.hasNext()) {
			
			Entry<String, Integer>  val=it.next();
			System.out.println("key: "+val.getKey()+"  values: "+val.getValue());
			
		}
		//lambda expression
		System.out.println("=======");
		syn.forEach((k,v)->System.out.println(k+"k: "+v+" :v"));
		
		//concurrentmap

		System.out.println("=======");
		ConcurrentHashMap<String,Integer> conmap=new ConcurrentHashMap<String, Integer>();
		conmap.put("Bipin", 9);
		conmap.put("tuk", 7);
		conmap.put("reja",10);
		System.out.println(conmap);
		     Iterator<String>  itr= conmap.keySet().iterator();
		     while(itr.hasNext()) {
		    	 String keys=  itr.next();
		    	 Integer val=conmap.get(keys);
		    	 System.out.println("KEY : "+keys+" VAL : "+val);
		     }
		 
		
	}

}
