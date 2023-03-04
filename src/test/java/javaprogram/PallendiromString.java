package javaprogram;

public class PallendiromString {

	public static void main(String[] args) {

		String name="NITIN";
		
		String b="";
		for(int i=name.length()-1;i>=0;i--) {
			
			b=b+name.charAt(i);
		}System.out.println("value of b "+b);
		if(b.contains(name)) {
			System.out.println("its a pallendirom");
		}else {
			System.out.println("not a Pallendorim");
		}
	}

}
