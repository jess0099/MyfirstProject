package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String [] xyz) {
		
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		//clonelist
		
		ArrayList<Integer> clone= (ArrayList)(list.clone());
		System.out.println(list);
		System.out.println("#######");
		System.out.println(clone);
		//sublist
		ArrayList<Integer> sublist=new ArrayList<>(list.subList(0, 2));
		System.out.println("############");
		System.out.println(sublist);
		
		ArrayList<String> list1=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String>  list2=new ArrayList<>(Arrays.asList("B","C","A","D","E"));
		
		System.out.println("===============");
	
		
		//equals
		
		System.out.println(list1.equals(list2));//false
		System.out.println("===========");
		Collections.sort(list2);
		System.out.println(list1.equals(list2));//true
		System.out.println("=========");
		ArrayList<String> list3=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String>  list4=new ArrayList<>(Arrays.asList("B","C","A","D","F"));
		//common elements
		list3.retainAll(list4);
		System.out.println(list3);
		
		
		//additional elements
		
		System.out.println("-----------");
	//	list3.removeAll(list4);
		System.out.println(list3);
		
		//difference elements
		System.out.println("-----------");
		list4.removeAll(list3);
		System.out.println(list4);
		
		System.out.println("==========");
		//remove duplicate value from list
		ArrayList<Integer> duplicatelist=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,3,7,8,2,8,1,9));
	System.out.println(duplicatelist);
		
		//1.set
		Set<Integer> se=new HashSet<Integer>(duplicatelist);
		ArrayList<Integer>   noduplicate=new ArrayList<>(se);
		System.out.println(noduplicate);
		//2. By using stream()
		System.out.println("----------");
		List<Object> dd=duplicatelist.stream().distinct().collect(Collectors.toList());
	System.out.println(dd);
	
	//find out duplicate in list by using set
	System.out.println("------------------------");
	HashSet<Integer> set=new HashSet<>();
	for(int val:duplicatelist) {
		if(set.add(val)==false) {
			System.out.print(","+ val);
		}
	}
	//convert arraylist to arrays
	
	ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,2,3,5,7));
	
	 Object arry[]=   arr.toArray();
	 
	 for(Object aa:arry) {
		 System.out.println(aa);
	 }
	 
	 //find only even number from duplicate list
	 System.out.println("=====================================");
	 duplicatelist.removeIf(e->e%2!=0);
	 System.out.println(duplicatelist);
}
}