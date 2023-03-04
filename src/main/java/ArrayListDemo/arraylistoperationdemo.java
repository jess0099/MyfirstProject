package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylistoperationdemo {

	public static void main(String[] args) {

		ArrayList<String> list1=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> list2=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> list3=new ArrayList<>(Arrays.asList("A","B","C","D","F"));
		
		//System.out.println(list1.equals(list2));//true
	//	System.out.println(list1.equals(list3));//false
		System.out.println("=======");
		//difference
		System.out.println(list1.removeAll(list3));
		//System.out.println(list3.removeAll(list1));
		
		
		ArrayList<String> list4=new ArrayList<>();
		list4.add("java");
		list4.add("python");
		list4.add("c#");
		list4.add("dotnet");
		
		                    ArrayList<String> clonlist= (ArrayList<String>)list4.clone();
		                    System.out.println(clonlist);
		                    
		                    ArrayList<String> list5=new ArrayList<>(Arrays.asList("A","B","C","D","F"));   
		                    
		                ArrayList<String> list6=new ArrayList<>(list5.subList(2, 3));
		                System.out.println(list6);
		                
		                
		                //convert arrayList to array
		                
		                ArrayList<Integer> list7=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		                System.out.println("========="); 
		                list7.removeIf(e->e%2==0);
		                System.out.println(list7);
		      Object[] arr= list7.toArray();
		    System.out.println("=========");  
		for(Object o:arr) {
			System.out.println(o);
		}
		//to -arraylist
		ArrayList<String> list8=new ArrayList<>(Arrays.asList("Testing","develop"));
		list4.addAll(list8);
		System.out.println(list4);
		                    
	}

}
