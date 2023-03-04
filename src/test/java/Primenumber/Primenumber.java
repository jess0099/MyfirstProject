package Primenumber;

public class Primenumber {

	public static void main(String[] args) {

		int i;
	int num;
	for(num=2;num<100;num++) {
		for(i=2;i<num;i++) {
			if(num%i==0) {
				
				System.out.println("not a prime "+num);
				break;
			}
				
			}if(i==num) {
				System.out.println("prime number"+num);
			}
		}
		
	}

}
