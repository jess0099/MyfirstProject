package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSynchronizeddemo {

	public static void main(String[] args) {

		
		//By explicitly synchronized
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		ArrayList<Integer> lb=new ArrayList<>(Arrays.asList(1,2,3,2,4,5,1,2,8,7,9));
		System.out.println("--lb--"+lb);
		       List<Integer> lsb=Collections.synchronizedList(lb);
		       
		       synchronized(lsb) {
		    	     Iterator<Integer> iit= lsb.iterator();
		    	     System.out.println("***************"); 
		    	                 while(iit.hasNext()) {
		    	              	 
		    	              int k=iit.next();
		    	              System.out.println("value of iit"+k);
		    	                	 
		    	                 }
		    	                 
		    	                 for(Integer m:lsb) {
		    	                	 System.out.println(m);
		    	                 }
		       }
		       
	List<Integer> lsysncoist=Collections.synchronizedList(list);
	
	synchronized(lsysncoist) {
	
		     Iterator<Integer>  it=  lsysncoist.iterator();
		    
		     
		     while(it.hasNext()) {
		    	int l=it.next();
		    	System.out.println("find the value with iterator"+l);
		     }
	
		    	 for(Integer b:lsysncoist) {
			    	 System.out.println(b);
			     }
	}
	
	//BYCopyonwrite  this is automatically synchronized list
	
	CopyOnWriteArrayList<String> ll=new CopyOnWriteArrayList<String>();
	   ll.add("Abhishek");
	   ll.add("Ram");
	   ll.add("temple");
	   System.out.println(ll);
	   System.out.println("=============");
	   ll.forEach(e->System.out.println(e));
	   
	  CopyOnWriteArrayList<Integer>  synch=new CopyOnWriteArrayList<Integer>(Arrays.asList(1,2,4,3,7,0,9));
	  
	  System.out.println(synch);
	  
	  synch.forEach(w->System.out.println(w));
		
	}

}
