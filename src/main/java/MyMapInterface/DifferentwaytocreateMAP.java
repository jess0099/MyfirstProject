package MyMapInterface;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;


public class DifferentwaytocreateMAP {

	public static Map<String,Integer> map1;
	static {
		map1=new HashMap<String,Integer>();
		map1.put("Amit",100);
		map1.put("Bikash",200);
		map1.put("Tean",300);
	}
	
	public static void main(String[] args) {
     //1. static map  
	System.out.println(DifferentwaytocreateMAP.map1.get("Tean"));
	System.out.println("======");
		//2. Immutable
		Map<String,String> map2=Collections.singletonMap("Been","210");
		System.out.println(map2.get("Been"));
		System.out.println("======");
		//map2.put("Sus","121");//UnsupportedOperationException
		//3. stream string simple entry
		
		Map<String,String> map4=Stream.of(
				new AbstractMap.SimpleEntry<>("AMIT","A"),
				new AbstractMap.SimpleEntry<>("AMIT","A"),
				new AbstractMap.SimpleEntry<>("AMIT","A")
				
				).collector(Collections.toMap(Map.Entry::getKey,Map.Entry::getValue));
				
		//4. by using array	
		Map<String,String> map5=Stream.of(new String[][] {
			{"Amit","124"},
			{"Sumit","231"},
			{"Amit","251"},
				
				
		}).collector(Collections.toMap(e->e[0],e->e[1]));
		
		Map<String,String> emptymap=Map.of();
		Map<String,String> immutable=Map.of("k","v");
	//	multi
		
		Map<String,String> multi=Map.of("k1","v1","k2","v2","k3","v3");
		
		///Map.ofenterie#immutable
		Map<String,String> map8=Map.ofEntries(
				new AbstractMap.SimpleEntry<>("A",100),
				new AbstractMap.SimpleEntry<>("B",200),
				new AbstractMap.SimpleEntry<>("C",300)
				);
		System.out.println(map8.get("B"));
				
	}

}
