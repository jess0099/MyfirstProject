package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicatearraylist {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,5,3,1,7,8,5,2,3,9,9));
		
		Set<Integer> set=new HashSet<>();
		
		//to find the duplicate in arraylist
		for(int val:list) {
			
			if(set.add(val)==false) {
				System.out.println(val);
			}
			
		}
		
		//remove duplicate from arraylist
		
		LinkedHashSet<Integer> se=new LinkedHashSet<>(list);
		List<Integer> ll=new ArrayList<>(se);
		System.out.println("========");
		//ll.forEach(v->System.out.println(v));
		System.out.println(ll);
		
		//jdk 1.8(Stream method)
		System.out.println("========");
		List<Integer> bb=list.stream().distinct().collect(Collectors.toList());
		System.out.println(bb);
		//
		ArrayList<Integer> uk=new ArrayList<>(Arrays.asList(1,2,3,4,2,5));
		System.out.println(uk);
		
		 System.out.println(java.time.LocalDateTime.now());    
		
	}

}
