package ArrayList;

public class DupplicateArray {

	public static void main(String[] args) {

		int [] arr=new  int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=2;
		arr[3]=3;
		arr[4]=2;
		
		
	//	System.out.println(arr[5]);Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
		//at ArrayList.DupplicateArray.main(DupplicateArray.java:16)
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
			}
		}
		
	}
	}
}
