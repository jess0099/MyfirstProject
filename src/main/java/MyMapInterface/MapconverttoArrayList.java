package MyMapInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapconverttoArrayList {

	public static void main(String[] args) {

		Map<String,Integer> hashmap1=new HashMap<>();
		hashmap1.put("Amit", 1);
		hashmap1.put("sumit", 2);
		hashmap1.put("punit", 3);
		System.out.println(hashmap1);
		System.out.println("========");
		ArrayList<String> list=new ArrayList<>(hashmap1.keySet());
		System.out.println(list);
		for(String ll:list) {
			System.out.println(ll);
		}
		System.out.println("========");
		list.forEach(e->System.out.println(e));
		ArrayList<Integer> val=new ArrayList<>(hashmap1.values());
		System.out.println("============");
		System.out.println(val);
		
		Iterator<Integer> bb=val.iterator();
		
		while(bb.hasNext()) {
			  int mm=bb.next();
			  System.out.println(mm);
			
		}
		
		//Map convert to arraylist(Bykeys)
		
		Map<String,Integer> map2=new HashMap<>();
		map2.put("RAGhu", 123);
		map2.put("Jimmy", 220);
		map2.put("Bates", 300);
		 
		List<String>  mtol=new ArrayList<>(map2.keySet());
		mtol.forEach(D->System.out.println(D));
		System.out.println("########");
		for(String name:mtol) {
			System.out.println(name);
		}
		
		      Iterator<String>  it= mtol.iterator();
		      while(it.hasNext()) {
		    	String key= it.next();
		    	System.out.println(key);
		      }
		      
		   //   By values
		      
		      ArrayList<Integer> valofl=new ArrayList<>(map2.values());
		      System.out.println("########");
		      for(int i=0;i<valofl.size()-1;i++) {
		    	  System.out.println(valofl);
		      }
	}

}
