package jianzhi;

public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//二进制中1的个数
		//输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示
		int val = 101; // input data
		int ans = 0;
		while (val != 0) {
		    ++ans;
		    val = val & (val-1);
		}
	}

}
