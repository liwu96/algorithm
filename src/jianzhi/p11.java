package jianzhi;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	��ֵ�������η�
		//����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
		//��֤base��exponent��ͬʱΪ0
		double base ;
		int exp ;
		

	}
	double Power(double b, int n) {
        if (n < 0) {
            b = 1 / b;
            n = -n;
        }
        double ret = 1.0;
        for (int i=0; i<n; ++i) ret *= b;
        return ret;
    }

}
