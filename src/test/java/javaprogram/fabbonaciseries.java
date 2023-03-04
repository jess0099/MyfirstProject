package javaprogram;

public class fabbonaciseries {
	
	public static void main(String [] xyz) {
		
		int a=1;
		int b=2;
		for(int i=1;i<10;i++) {
			int c=a+b;
			System.out.println("val of a"+a+"val of b"+b+"val of c"+c);
			a=b;
			b=c;
		}
	}

}
