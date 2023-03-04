package Map;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Stream;

public class differentwaytocreatemap {

	public static void main(String[] args) {

		Map<String,Integer> map1=Collections.singletonMap("A",1);
		
		//map1.put("B",2);
		System.out.println(map1);
		
		Map<String,Integer> map2=Stream.of(
				new AbstractMap.SimpleEntry<>("A",1),
				new AbstractMap.SimpleEntry<>("Amit",2),
				new AbstractMap.SimpleEntry<>("Baby",3),
				new AbstractMap.SimpleEntry<>("nany",4)
				
				).collector(Collections.toMap(Map.Entry::getkey,Map.Entry::getvalue));
		
		
		
		Map<Stirng,Integer>  map3=Stream.of(String [][]){
			
			{"Amit",1},
			{"bikash",2},
		}).collector(Collections.tomap(e->e[0],e->e[1]));
				
		Map<Stirng,Integer>	   map4=map.of("A",1);
		Map<String,Integer>  map5=map.of();
		
		Map<String,Integer> map6=map.of("A",1,"B",2,"C",4);
		
		Map<String,Integer> map7=map.of(
				new AbstractMap.SimpleEntry<>("A",1),
				new AbstractMap.SimpleEntry<>("B",2)
				);
		System.out.println(map7.get("B"));
				
		
	}

}
