package javaprogram;

import java.util.Scanner;

public class palendromprogram {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int rev=0;
		int k=num;
		
		while(num>0) {
			int remind=num%10;
			rev=rev*10+remind;
			num=num/10;
		}if(k==rev) {
			System.out.println("this is pallendirom->"+rev);
		}else {
			System.out.println("not a pallendirom->"+rev);
		}
		
	}

}
