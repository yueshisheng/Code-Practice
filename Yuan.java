package datastructure;

public class Yuan {
	public static void main(String [] args) {
		int count=0;
		int [][] a=new int[2000][2000];
		for(int i=1;i<1000;i++) {
			for(int j=1;j<1000;j++) {
				if((i*i+j*j)<=(1000*1000)) {
					count++;
				}
			}
		}
		System.out.print(count*4);
		
	}

}
