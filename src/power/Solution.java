package power;

/*
 * ����һ��double���͵ĸ�����base��int���͵�����exponent��
 * ��base��exponent�η���
 */
public class Solution {
	public double Power(double base, int exponent) {
		double result = 1;
		for (int i = 0; i < Math.abs(exponent); i++) {
			result *= base;
		}
		if (exponent < 0) {
			result = 1 / result;
		}
		return result;
	}
}
