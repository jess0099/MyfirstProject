package javaprogram;

import java.util.Scanner;

public class swapno {

	public static void main(String[] args) {

		Scanner sb=new Scanner(System.in);
		
		int a=sb.nextInt();
		int b=sb.nextInt();
		
		int c=a+b;
		 a=c-a;
		System.out.println("val of a "+a);
		b=c-b;
		System.out.println("val of b "+b);
	}

}
