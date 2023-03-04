package javaprogram;

import java.util.Scanner;

public class RevrseString {

	public static void main(String[] args) {
//revrese string
		String str="amit and ankur having sandwich 1212  345 ";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}System.out.println(rev);
		
		
		//palendirom
		int num=12321;
		int rvr=0;
	
		int k=num;
		while(num>0) {
			int remind=num%10;
			rvr=rvr*10+remind;
			num=num/10;
		}System.out.println("revrse num is:"+rvr);
		if(k==rvr) {
			System.out.println("pallendirom");
		}else {
			System.out.println("not a pallendirom");
		}
		
		//fabonacci series
	//	int a=1;
		//int b=3;
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		 for(int j=1;j<11;j++) {
		int c=a+b;
		System.out.println(c);
		
		a=b;
		b=c;
		
		//factorail
		
		int fact=sc.nextInt();
		
		for(int i=fact-1;i>0;i--) {
			fact=fact*i;
		}System.out.println("factorail value is:"+fact);
	}
	}
}
