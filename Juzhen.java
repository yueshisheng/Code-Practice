package datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Juzhen {
    public static void main(String []args) throws IOException {
    	File file=new File("F:\\1.txt");
    	InputStreamReader isr=new InputStreamReader(new FileInputStream(file));
    	BufferedReader br=new BufferedReader(isr);
    	int [][] a=new int[3][3];
    	int [][] b=new int[3][3];
    	int [][] c=new int[3][3];
    	String q=br.readLine();
    	String t=br.readLine();
    	String [] e=q.split(" ");
    	String [] l=t.split(" ");
    	for(int i=0;i<3;i++) {
    		a[0][i]=Integer.parseInt(e[i]);
    	}
    	for(int i=0;i<3;i++) {
    		a[1][i]=Integer.parseInt(e[i+3]);
    	}
    	for(int i=0;i<3;i++) {
    		a[2][i]=Integer.parseInt(e[i+6]);
    	}
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<3;j++) {
    		System.out.print(" "+a[i][j]);
    		}
    	}
    	
    	System.out.println();
    	for(int i=0;i<3;i++) {
    		b[0][i]=Integer.parseInt(l[i]);
    	}
    	for(int i=0;i<3;i++) {
    		b[1][i]=Integer.parseInt(l[i+3]);
    	}
    	for(int i=0;i<3;i++) {
    		b[2][i]=Integer.parseInt(l[i+6]);
    	}
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<3;j++) {
    		System.out.print(" "+b[i][j]);
    		}
    	}
    	System.out.println();
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<3;j++) {
    			for(int k=0;k<3;k++) {
    			c[i][j]+=a[i][k]*b[k][j];
    			
    			}
    			System.out.print(" "+c[i][j]);
    		}
    	}
    	
    }
}
