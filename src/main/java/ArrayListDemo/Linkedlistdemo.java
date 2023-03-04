package ArrayListDemo;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {

		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(1);
		ll.add(6);
		ll.add(7);
		ll.add(4);
		ll.add(5);
		ll.add(2);
		ll.add(3);
		System.out.println(ll);//fetching the record in same way as they in inserted
		
		ll.remove(5);
		System.out.println(ll);//insertion and deletion is faster
		
		ll.addFirst(9);
		ll.addLast(8);
		System.out.println(ll);
		ll.remove(1);
		ll.addLast(8);
		System.out.println(ll);
		System.out.println("========");
		Collections.sort(ll);
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
	}

}
