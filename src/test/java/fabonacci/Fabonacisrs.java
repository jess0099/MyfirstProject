package fabonacci;

import java.util.Scanner;

public class Fabonacisrs {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=1;i<10;i++) {
			
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}

}
