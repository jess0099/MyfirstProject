package JavaProgram;

public class ReverseName {

	public static void main(String[] args) {
   String name="AmitBhAti";
   //reverse the name
   
   char find='A';
   String b="";
   char t='t';
   for(int i=name.length()-1;i>=0;i--) {
	   
	   b=b+name.charAt(i);
   }
		System.out.println(b);
		
		//number of occurrence
		
		//by using lambda expression using java 8
		
		
	long count=	name.chars().filter(ch->ch==find).count();
	System.out.println("total number of occurence of A"+count);
		//by using for and if conditions
	int count1=0;
	for(int j=name.length()-1;j>=0;j--) {
		if(name.charAt(j)==t) {
			count1++;
		}
	}
	System.out.println("value occurence number "+count1);
	
	
	String value="Rohitsharma";
	char search='h';
	
	String v="";
	int count2=0;
	for(int r=value.length()-1;r>=0;r--) {
		v=v+value.charAt(r);
		if( value.charAt(r)==search) {
			count2++;
		}
	}
	System.out.println("value of val "+v+" count "+count2);
	//by using lambda expression
	
	      long count3= value.chars().filter(ch->ch==search).count();
	      System.out.println(count3);
	      System.out.println("=========");
	      String  myname="ViratKohli";
	      String rev="";
	      char d='i';
	      int countr=0;
	      for(int k=myname.length()-1;k>=0;k--) {
	    	  rev=rev+myname.charAt(k);
	    	  if(myname.charAt(k)==d) {
	    		  countr++;
	    	  }
	      
	      }System.out.println("rev name is: "+rev+"    count are: "+countr);
		//by using lambdaexpression
	     long count5= myname.chars().filter(ft->ft==d).count();
	     System.out.println(count5);
	}

}
