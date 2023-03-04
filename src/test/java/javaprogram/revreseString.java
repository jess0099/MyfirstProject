package javaprogram;

import java.util.Scanner;

public class revreseString {

	public static void main(String[] args) {
//reverse number
		String str="Amit and Ankur having dinner in the team";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			                rev=rev+str.charAt(i);
			                
	}System.out.println("reverse are --"+rev);
	//prime number
	
	int  i,num;
	
	Scanner sc=new Scanner(System.in);
	int j=sc.nextInt();
	for( num=2;num<j;num++) {
	for(i=2;i<num;i++) {
		if(num%i==0) {
			System.out.println("it is not a prime number"+num);
			break;
		}
	}
	if(i==num) {
		System.out.println("it is a prime number"+num);
	}
		
	}
	//fabbonacci series
	System.out.println("########################");
	int a=sc.nextInt();
	int b=sc.nextInt();
	for(int m=1;m<10;m++) {
	int c=a+b;
	System.out.println("fabonacci series are:--"+c);
	a=b;
	b=c;
	
	}
	//factorail number
	
	System.out.println("#####factorail number are#####");
      int fact=sc.nextInt();
for(int p=fact-1;p>=1;p--) {
	fact=fact*p;
	
}System.out.println(fact);

//Pallendirom
System.out.println("##############enter the pallendirom number############");

int pdm=sc.nextInt();
int rv=0;
int v=pdm;

while(pdm>0) {
	int remind=pdm%10;
	rv=rv*10+remind;
	pdm=pdm/10;
}if(v==rv) {
System.out.println("its a pallendirom "+rv);

	}else {
		System.out.println("it is not a pallendirom"+rv);
	}
}
}