package javaprogram;

public class reverseString {

	public static void main(String[] args) {

		String str="amit bhati  iti 10";
		char s='i';
		String b="";
		for(int i=str.length()-1;i>=0;i--) {
			
			b=b+str.charAt(i);
		}
		System.out.println("rev string are: "+b);
		
		
		
		//character duplicate
		int count=0;
		for(int j=0;j<str.length();j++) {
			
			if(str.charAt(j)==s) {
				count++;
				
			}
		}
		System.out.println("count: "+count);
	}
	
	

}
