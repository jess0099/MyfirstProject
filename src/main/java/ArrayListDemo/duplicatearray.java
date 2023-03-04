package ArrayListDemo;

public class duplicatearray {

	public static void main(String[] args) {

		int [] a=new int[5];
		a[0]=1;
		a[2]=2;
		a[3]=3;
		a[4]=2;System.out.println("========");
		a[1]=4;
		
		System.out.println(a[1]);
		System.out.println("=================");
		
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
		
		
	}

}
