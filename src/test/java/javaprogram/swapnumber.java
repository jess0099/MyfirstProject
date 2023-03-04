package javaprogram;

import java.util.Scanner;

public class swapnumber {

	public static void main(String[] args) {

		
		int a=123;
		int b=456;
		
		int c=a+b;
		a=c-a;
		b=c-b;
		System.out.println("val of a"+a);
		System.out.println("val of b"+b);
		
		//without using third variable
		
		int i=23;
		int j=45;
		
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("val of i"+i);
		System.out.println("val of j"+j);
		
		//fabonacci series
		
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int q=sc.nextInt();
		for(int s=1;s<10;s++) {
		int r=p+q;
		System.out.println(r);

p=q;
q=r
;}
		
		
		
		

}
}