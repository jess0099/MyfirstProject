package javaprogram;

import java.util.Scanner;

public class Pallendirom {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		
		
		int num=sc.nextInt();
		
		int f=0;
		f=num;
		int rev=0;
		
		while(num>0) {
			int remind=num%10;
			
			rev=rev*10+remind;
			
			num=num/10;
			
		}
		if(f==rev) {
			System.out.println("its a pallendirom"+rev);
		}else {
			System.out.println("its not a pallendirom"+rev);
		}
		
		
	}

}
