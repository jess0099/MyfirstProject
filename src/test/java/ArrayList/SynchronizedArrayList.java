package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {

		
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,5,7,9));
		//1. synchronized arraylist
		
		List<Integer> sync=   Collections.synchronizedList(list);
		
	synchronized(sync) {
		
		                Iterator<Integer>    it=    sync.iterator();
		                
		                while(it.hasNext()) {
		                	
		                	int ll=it.next();
		                	System.out.println(ll);
		                }
	}
	    CopyOnWriteArrayList<Integer>  cpw=new CopyOnWriteArrayList<Integer>(Arrays.asList(3,8,9,1,3,2));
	    System.out.println(cpw);
	
	
	}

}
