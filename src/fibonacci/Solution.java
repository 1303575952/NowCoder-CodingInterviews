package fibonacci;

/*
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
 * n<=39
 */
public class Solution {
	public int Fibonacci(int n) {
		if (n <= 1)
			return n;
		else
			return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
}
