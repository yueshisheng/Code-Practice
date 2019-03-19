package datastructure;

import java.util.Scanner;

public class Calculator {
	public  static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int sc1=sc.nextInt();
	int hour=sc1/3600;
	int minute=(sc1-3600*hour)/60;
	int second=sc1-3600*hour-60*minute;
	System.out.println(hour+":"+minute+":"+second);
	
	}

}
