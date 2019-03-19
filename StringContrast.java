package datastructure;

import java.util.Scanner;

public class StringContrast {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String sc1=sc.nextLine();
		String sc2=sc.nextLine();
		if(sc1.length()!=sc2.length()) {
			System.out.println("1");
		}else if(sc1.equals(sc2)) {
			System.out.println("2");
		}else if(sc1.equalsIgnoreCase(sc2)) {
			System.out.println("3");
		}else if(sc1.length()==sc2.length()&&!sc1.equalsIgnoreCase(sc2)) {
			System.out.println("4	");
		}
		}
		}
		
	

