package javaprogram;

public class Pallendiromprogram {

	public static void main(String[] args) {

		
		int num=565;
		int f;
		int rev=0;
		f=num;
		while(num>0) {
			int remind=565%10;
			 rev=rev*10+remind;
			 num=num/10;
		}
		System.out.println(rev+"#########");
		if(rev==f) {
			System.out.println("it is a pallendirom "+rev);
		}else {
			System.out.println("not a pallendirom "+rev);
		}
	}

}
