package datastructure;

public class Tri {
	public static void main(String [] args) {
		int count=0;
		int [] a1=new int[9];
		int [] a2=new int[9];
		int [] a3=new int[9];
		int [] a4=new int[9];
		int [] a5=new int[9];
		int [] a6=new int[9];
		int [] a7=new int[9];
		int [] a8=new int[9];
		int [] a9=new int[9];
		for(int i1=0;i1<9;(i1)++) {
			for(int i2=0;i2<9;(i2)++) {
				for(int i3=0;i3<9;(i3)++) {
					for(int i4=0;i4<9;(i4)++) {
						for(int i5=0;i5<9;(i5)++) {
							for(int i6=0;i6<9;(i6)++) {
								for(int i7=0;i7<9;(i7)++) {
									for(int i8=0;i8<9;(i8)++) {
										for(int i9=0;i9<9;(i9)++) {
											a1[i1]=i1+1;a2[i2]=i2+1;a3[i3]=i3+1;a4[i4]=i4+1;a5[i5]=i5+1;a6[i6]=i6+1;a7[i7]=i7+1;a8[i8]=i8+1;a9[i9]=i9+1;
											
											if((a1[i1]+a2[i2]+a4[i4]+a6[i6])==(a1[i1]+a3[i3]+a5[i5]+a9[i9])&&(a1[i1]+a2[i2]+a4[i4]+a6[i6])==(a6[i6]+a7[i7]+a8[i8]+a9[i9])
													&&a1[i1]!=a2[i2]&&a1[i1]!=a3[i3]&&a1[i1]!=a4[i4]&&a1[i1]!=a5[i5]&&a1[i1]!=a6[i6]&&a1[i1]!=a7[i7]&&a1[i1]!=a8[i8]&&a1[i1]!=a9[i9]
															&&a2[i2]!=a3[i3]&&a2[i2]!=a4[i4]&&a2[i2]!=a5[i5]&&a2[i2]!=a6[i6]&&a2[i2]!=a7[i7]&&a2[i2]!=a8[i8]&&a2[i2]!=a9[i9]
																	&&a3[i3]!=a4[i4]&&a3[i3]!=a5[i5]&&a3[i3]!=a6[i6]&&a3[i3]!=a7[i7]&&a3[i3]!=a8[i8]&&a3[i3]!=a9[i9]
																			&&a4[i4]!=a5[i5]&&a4[i4]!=a6[i6]&&a4[i4]!=a7[i7]&&a4[i4]!=a8[i8]&&a4[i4]!=a9[i9]
																					&&a5[i5]!=a6[i6]&&a5[i5]!=a7[i7]&&a5[i5]!=a8[i8]&&a5[i5]!=a9[i9]
																							&&a6[i6]!=a7[i7]&&a6[i6]!=a8[i8]&&a6[i6]!=a9[i9]
																									&&a7[i7]!=a8[i8]&&a7[i7]!=a9[i9]
																											&&a8[i8]!=a9[i9]) {
												count++;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count/6);
	}

}
