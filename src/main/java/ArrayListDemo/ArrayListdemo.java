package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class ArrayListdemo {
public static void main(String[] args) {
              ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,2,1,3,5));
              System.out.println(list);
              
              ArrayList<String>  lb=new ArrayList<>(Arrays.asList("az","by","cx","dw"));
              System.out.println(lb);
              ArrayList<String> ls=    (ArrayList)lb.clone();
              System.out.println(ls+"--ls--");
              //cloneList
                               ArrayList<Integer>  ll=(ArrayList)list.clone();
                               System.out.println(ll+"clone");
		//SubList
                               ArrayList<String> sb=new ArrayList<>(ls.subList(0, 2));
                               System.out.println(sb+"-sblist-");
                               ArrayList<Integer> sublisted=new ArrayList<>(ll.subList(5, 9));
                               System.out.println(sublisted);
                               //
                               
                               ArrayList<String> list1=new ArrayList<>(Arrays.asList("A","B","C","D","F"));
                               ArrayList<String> list2=new ArrayList<>();
                               list2.add("B");
                               list2.add("C");
                               list2.add("A");
                               list2.add("D");
                               System.out.println(list2);
                               
                               ArrayList<String>  list3=new ArrayList<>(Arrays.asList("A","C","D","B","E"));
                               
                               //equals
                               
                               Collections.sort(list2);
                               System.out.println(list2);
                               
                      System.out.println(list1.equals(list2));    //true  
		Collections.sort(list3);
		System.out.println(list1.equals(list3));//false
		
		//additional elements -------------
		System.out.println("=========================");
		//list1.removeAll(list3);
		System.out.println(list1);
		
		//difference -----------
		
	//	list3.removeAll(list1);
		System.out.println(list3);
		
		//common element in both list1 and list3-------
		System.out.println("=========================");
		list1.retainAll(list3);
		System.out.println(list1);
		
		//how can we find out duplicate value in ArrayList
		
		ArrayList<Integer> list5=new ArrayList<>(Arrays.asList(1,2,3,4,5,2,3,8,9,6));
		Set<Integer> set=new HashSet<>();
		
	   //Iterator<Integer>it=list5.iterator();
		System.out.println("=========================");
	  
		   for(int val:list5) {
			   if(set.add(val)==false) {
				   System.out.println(val);
			   }
		   }
		//remove  duplicate value from array list
		  //1.by using stream()
		   System.out.println("=========================");
		   
		List<Object>  dd= list5.stream().distinct().collect(Collectors.toList());
		System.out.println(dd);
		
		//2. By using linkedhasset
		 System.out.println("=========================");
		Set<Integer> hset=new LinkedHashSet<>(list5);
		List<Integer> duplicatelist=new ArrayList<>(hset);
		System.out.println(duplicatelist);
		   
		
		//3. convert to array[]
		 System.out.println("=========================");
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,4,5,1));
		
		             Object arr []= al.toArray();
		             System.out.println(arr[2]);
		             for(Object b:arr) {
		            	 System.out.println(b);
		             }
		             //by lambda expression
		             
		             al.forEach(v->System.out.println(v));
	}

}
