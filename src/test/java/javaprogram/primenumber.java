package javaprogram;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int num=1;
		
		int i;
		for(int num=2;num<100;num++) {
		for( i=2;i<num;i++) {
		
			if((num%i==0)) {
				System.out.println("not a prime number--"+num);
				break;
			}
		}
			if(i==num) {
				System.out.println("its a prime number"+num);
			}
			
		}
		
	}
}

