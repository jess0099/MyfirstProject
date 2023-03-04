package ArrayListDemo;

public class Duplicateaarray {

	public static void main(String[] args) {
     int [] a=new int [9];
     a[0]=5;
     a[1]=2;
     a[2]=3;
     a[3]=2;
     a[4]=1;
     a[5]=5;
     a[6]=6;
     a[7]=3;
     
     System.out.println(a[8]);
     
     for(int i=0;i<a.length;i++) {
    	 for(int j=i+1;j<a.length;j++) {
    		 if (a[i]==a[j]) {
    			 System.out.println(a[i]);
    		 }
    	 }
     }
		
	
     //duplicate array findout
  /*   
     String  [] k=new String[5];
     k[0]="Akaksh";
     k[1]="bani";
     k[2]="mukul";
     k[3]="raj";
     k[4]="bani";
     
     for(String i=0;i<k.length;i++) {
    	 for(String s=i+1;s<k.length;s++) {
    		 
    		 if(i[k]==s[k]) {
    			 
    		 }
    	 }
     }*/
     
     
     int [] k=new int[5];
     k[0]=5;
     k[1]=6;
     k[2]=4;
     k[3]=5;
     k[4]=6;
     System.out.println("####################");
     for(int i=0;i<k.length;i++) {
    	 for(int s=i+1;s<k.length;s++) {
    		 
    		 if(k[i]==k[s]) {
    			 System.out.println(k[i]);
    		 }
    	 }
     }
	}

}
