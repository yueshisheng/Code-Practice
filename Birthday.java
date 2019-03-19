package datastructure;

public class Birthday {
   public static void main(String [] args) {
	   
	 
	   for(int n=1;n<30;n++) {
		   int sum=0;
		   for(int l=0;l<30;l++) {
			   sum=sum+n+l;
			   if(sum==236) {
				   System.out.println(n);
				   break;
			   }
		   }
		  
	   }
   }
}
