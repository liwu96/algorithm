package jianzhi;

public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������1�ĸ���
		//����һ���������������32λ�����Ʊ�ʾ��1�ĸ��������и����ò����ʾ
		int val = 101; // input data
		int ans = 0;
		while (val != 0) {
		    ++ans;
		    val = val & (val-1);
		}
	}

}
