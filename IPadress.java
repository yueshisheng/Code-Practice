package datastructure;
import java.util.Scanner;
public class IPadress {
   public static void main(String [] args) {
	   Scanner sc=new Scanner(System.in);
	   //String sss=sc.nextLine();
	   //String [] ss=sss.split(sss, '.');
	   //System.out.println(ss[1]);
	   String [] ss=sc.nextLine().split("\\.");
	   //for(int i=0;i<ss.length;i++) {
		   //System.out.println(ss[i]);
	   //}
	   int a=Integer.parseInt(ss[0]);
	   int b=Integer.parseInt(ss[1]);
	   int c=Integer.parseInt(ss[2]);
	   int d=Integer.parseInt(ss[3]);
	   
	   if(a>=0&&a<=255&&b>=0&&b<=255&&c>=0&&c<=255&&d>=0&&d<=255) {
		   System.out.println("Yes!");
		   //for(int i=0;i<ss.length;i++) {
			 //  System.out.print(ss[i]);
		//   }
	   }else {
		   System.out.println("No!");
	   }
	   
	   
   }
}
