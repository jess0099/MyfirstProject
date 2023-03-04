package JavaProgram;

public class reversenum {

	public static void main(String[] args) {

		int num=279;
		int rev=0;
		int temp=0;
		
		while(num>0) {
			
			int remind=num%10;
			
			 rev=rev*10+remind;
			  num=num/10;
		}
		if(temp==num) {
		System.out.println(rev+" its a pallendirom ");
		
	}else {
		System.out.println(rev);
	}
	}
}
