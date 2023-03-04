package MyMapInterface;

import java.util.Hashtable;
import java.util.Map;

public class HashTabledemo {

	public static void main(String[] args) {

		
		Map<String,Integer> map=new Hashtable<>();
		map.put("Amit", 100);
		map.put("Samit", 1100);
		map.put("Sumit", 1001);
		map.put("Punit", 1010);
		map.put("Vinit", 101);
		map.put("Rohit", 111);
		map.put("Ankit", 110);
		map.put("null", 1);
		map.put("Ronit", 102);
		map.put("Amit1", null);
		
		System.out.println(map.get("null"));//java.lang.NullPointerException
		System.out.println(map.get("Amit1"));//java.lang.NullPointerException
		
		
	}

}
