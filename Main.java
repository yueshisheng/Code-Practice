package datastructure;

public class Main {
	static String num = "";
	static int flag[] = new int[10];
	static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(0,num);
		System.out.println(sum/2);//����������������Ϊһ�ַ����������Ҫ����2
	}
	static void fun(int n,String num){//������������1-9��������
		if(n==9){
			insert(num);
			return ;
		}
		for(int i=1;i<=9;i++){
			if(flag[i]==0){
				flag[i] = 1;
				fun(n+1,num+i);
				flag[i] = 0;
			}
		}
	}
	static void insert(String num){//�����������Ϊ�������֣������������
		for(int i=1;i<9;i++){
			String left = num.substring(0, i);
			String right = num.substring(i, 9);
			int res = Integer.parseInt(left)*Integer.parseInt(right);
			if(check(res,num)){
				//System.out.println(left+"*"+right+"="+res);//�����������ڼ��
				sum++;
			}
		}
	}
	static boolean check(int res,String num){//�����жϼ������Ƿ�����1-9	
		int[] resFlag = new int[10];
		resFlag[0] = 1;
		String s = String.valueOf(res);
		if(s.length()!=9){
			return false;
		}
		for(int i=0;i<9;i++){
			int n = Integer.parseInt(s.substring(i,i+1));
			if(resFlag[n]==0){
				resFlag[n] = 1;
			}
			else{
				return false;
			}
		}
		return true;
	}
}
