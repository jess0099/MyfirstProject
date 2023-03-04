package Pallendirom;

public class Pallendirom {

	public static void main(String[] args) {
              
		int num=1231;
		int f;
		f=num;
		int rev=0;
		while(num>0) {
			
		int	remind=num%10;
		
	           rev=rev*10+remind;
	           num=num/10;
			
		}
		if(f==rev) {
			
			System.out.println("pallendirom num"+rev);
		}else {
			System.out.println("not a pallendirom num"+rev);
		}
		
	}

}
