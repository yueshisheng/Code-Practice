package datastructure;

import java.util.Scanner;

public class RabbitAndTortoise {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int v1=sc.nextInt();
	int v2=sc.nextInt();
	int t=sc.nextInt();
	int s=sc.nextInt();
	int l=sc.nextInt();
	int s1=0;
	int s2=0;
	for(int i=1;i<40;i++) {
		s1=s1+1*v1;
		s2=s2+1*v2;
		/*
		if((s1-s2)<t) {
		s1=s1+1*v1;
		s2=s2+1*v2;
		if(s1==l&&s2==l) {
			System.out.println("D");
			System.out.println(i);
			break;
			
		}else if(s1==l) {
			System.out.println("R");
			System.out.println(i);
			break;
		}else if(s2==l) {
			System.out.println("T");
			System.out.println(i);
			
			break;
		}
		*/
		if((s1-s2)>=t) {
			s2=s2+s*v2;
			for(int t1=0;t1<s;t1++) {
				s1=s1+v1*0;
			}
			i=i+s;
			
			//s1=s1+v1*1;
			
		}
		if(s1==l&&s2==l) {
			System.out.println("D");
			System.out.println(i);
			break;
			
		}else if(s1==l) {
			System.out.println("R");
			System.out.println(i);
			break;
		}else if(s2==l) {
			System.out.println("T");
			System.out.println(i);
			
			break;
		}else {
			System.out.println("hhhh");
		}
		
		
		
		
}
}	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	int v3=v1;
	int s2=0;
	int s1=0;
	int r=0;
	for(int i = 1;i<20;i++) {
		//int s1=v2*i;
		//s2=v1*i;
		if((s2-s1)<t) {
		    s1=v2*i;
			s2=v1*(i-s*r);
		}else if((s2-s1)>=t) {
			
			for(int y=0;y<s;y++) {
				i++;
				s1=v2*i;
				v1=0;	
				
				//System.out.println(s2+"hhhh"+s1+"yy"+i);
				
			}
			v1=v3;
			//System.out.println(s2+"hhhhh"+i );
			r=r+1;
		}
		
		
		if(s1==l&&s2==l) {
			System.out.println("D");
			System.out.println(i);
			break;
			
		}else if(s1==l) {
			System.out.println("T");
			System.out.println(i);
			break;
		}else if(s2==l) {
			System.out.println("R");
			System.out.println(i);
			
			break;
		}
	}
}
}
*/	
	

