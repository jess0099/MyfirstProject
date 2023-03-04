package javaprogram;

import java.util.Scanner;

public class nunberprime {

	public static void main(String[] args) {

		      Scanner sc=new Scanner(System.in);
		  int j=sc.nextInt();
		      int i,num;
		      for( num=2;num<j;num++) {
		      for(i=2;i<num;i++) {
		    	  if(num%i==0) {
		    		  System.out.println("it is not a primenumber"+num);
		    		  break;
		    	  }
		      }
		      if(i==num) {
		    	  System.out.println("its a primenumber"+num);
		    	  
		      }
		
	}
		      
		           
	}
}
