package javaprogram;

public class findpriimenumber {

	public static void main(String[] args) {

		int i;
		int num;
		
		for(num=2;num<100; num++) {
			for(i=2;i<num;i++) {
				
				if(num%i==0) {
					System.out.println("Its not a prime number"+num);
					break;
				}
				
				
			}
			if(i==num) {
				System.out.println("its a primenumber"+num);
			}
		}
		
	}

}
