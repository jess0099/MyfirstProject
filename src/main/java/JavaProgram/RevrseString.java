package JavaProgram;

public class RevrseString {

	public static void main(String[] args) {

		String name="Amit bhati 10";
		String b="";
		
		for(int i=name.length()-1;i>=0;i--) {
			b=b+name.charAt(i);
		}
		
		System.out.println(b);
		
	}

}
