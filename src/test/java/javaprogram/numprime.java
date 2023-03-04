package javaprogram;

public class numprime {

	public static void main(String[] args) {
 
		int num;
		int i;
		
		for(num=2;num<100;num++) {
			for(i=2;i<num;i++) {
				if(num%i==0) {
					System.out.println("not a primeno"+num);
					break;
				}
				} if(i==num) {
					System.out.println("primeno is "+num);
			}
		}
	}

}
