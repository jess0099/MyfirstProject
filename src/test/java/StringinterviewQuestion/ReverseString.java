package StringinterviewQuestion;

public class ReverseString {

	public static void main(String[] args) {

		String name="ANIL AND SUNIL AND SATISH AND PINTU ARE BROTHER";
		String b="";
		for(int i=name.length()-1;i>=0;i--) {
			    b=b+name.charAt(i);
		}System.out.println(b);
		
	}

}
