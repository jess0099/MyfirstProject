package MyMapInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Treemapdemo {
//#Sortedmap, working on binary-tree concept,there is no hashing concept, sorting on key ascending order by default
	public static void main(String[] args) {

		Map<String,Integer> map=new TreeMap<>();
		
		map.put("Jule", 100);
		map.put("Amber", 300);
		map.put("Rake", 120);
		map.put("Latan", 1000);
		map.put("Zim", 500);
		map.put("bikey", 1500);
		
		      
		
		System.out.println(map);
		System.out.println("=======");
		                   Iterator<String> it= map.keySet().iterator();
		                   while(it.hasNext()) {
		                	   String key=it.next();
		                	   int val=map.get(key);
		                	   System.out.println(" key:"+key+" val:"+val);
		                   }
		//##### convert map to arraylist
		                   
		                   Map<String,Integer> conmap=new HashMap<>();
		                  conmap.put("Amit",300);
		                  conmap.put("Sumit",900);
		                  conmap.put("Punit",1200);
		                  conmap.put("vinit",2000);
		                  conmap.put("Kunal",900);
		                  System.out.println(conmap);
		              	System.out.println("=======");
		             List<String> list = new ArrayList(conmap.keySet());
		             System.out.println(list);
		             
		             for(String mn:list) {
		            	  	System.out.println("=======");
		            	 System.out.println(mn);
		             }
		             List<Integer>  list2=new ArrayList(conmap.values());
		              list2.forEach(e->System.out.println("val:"+e));
		             
		
	}

}
