package datastructure;

import java.util.Scanner;

public class Tongjishuzi {
    public static void main(String [] args) {
    	Scanner sc=new Scanner(System.in);
    	String ss=sc.nextLine();
        String[] sss=ss.split(" ");
    	for(int i=0;i<sss.length-1;i++) {
        
        System.out.print(sss[i].length()+" ");
    	
    }
    	System.out.print((sss[sss.length-1].length()));
}
}