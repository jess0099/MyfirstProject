package fabonacci;

import java.util.Scanner;

import org.testng.annotations.Test;

public class fabonacciseriesInterviewQ {

	@Test
	public  void test1() {

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=1; i<10;i++) {
			int c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}
	}
	
	
	@Test
	
	public void testfabonacci() {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		System.out.println("value of a"+a);
		int b=sc.nextInt();
		System.out.println("value of b"+b);
		for(int i=1;i<5;i++) {
			
			int c=a+b;
			
			System.out.println("fabonacci series are->"+c);
			a=b;
			b=c;
		}
	}

}
