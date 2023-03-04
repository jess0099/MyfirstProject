package SetIQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasSet {

	public static void main(String[] args) {

		//Set is care about uniqenes
		//not allow duplicate value,can have null values
		//not synchronized, not thread-safe,
		
		Set<Integer> ss=new HashSet<Integer>();
		ss.add(1);
		ss.add(2);
		ss.add(3);
		ss.add(4);
		ss.add(1);
		ss.add(null);
		ss.add(null);
		//by lambda expression
		ss.forEach(e->System.out.println(e));	
		
		
		System.out.println("--------------");
		Set<Integer> sb=new HashSet<Integer>();
		sb.add(5);
		sb.add(6);
		sb.add(7);
		sb.add(1);
		sb.add(2);
		//Add all
	//	ss.addAll(sb);
		
	/*	Iterator<Integer> ii=ss.iterator();
		while(ii.hasNext()) {
			Integer it= ii.next();
			System.out.println(it);  
		} */
		
		//common
	//	ss.retainAll(sb);
		
	/*	Iterator<Integer> ii=ss.iterator();
		while(ii.hasNext()) {
			Integer it= ii.next();
			System.out.println(it);  
		} */
		//difference
		ss.removeAll(sb);
		Iterator<Integer> ii=ss.iterator();
		while(ii.hasNext()) {
			Integer it= ii.next();
			System.out.println(it);  
		}
	//Synchronized set
		System.out.println("------------------------------");
		Set<String> syncset=Collections.synchronizedSet(new HashSet<String>(Arrays.asList("A","B","D","E")));
		
	Iterator<String> bb=syncset.iterator();
	while(bb.hasNext()) {
	String val=	bb.next();
	System.out.println(val);
	}
	
	
	}

}
