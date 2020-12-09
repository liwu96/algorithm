package jianzhi;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	数值的整数次方
		//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
		//保证base和exponent不同时为0
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
