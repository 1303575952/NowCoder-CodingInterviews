package number_of_1;

/*
 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
 * Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,���Ƕ��ں�����������û���ˡ�
 * ACMerϣ�����ǰ����,������������ձ黯,���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
 */
public class Solution {
	public int NumberOf1Between1AndN_Solution(int n) {
		int count = 0;
		while (n > 0) {
			String str = String.valueOf(n);
			char[] chars = str.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] == '1')
					count++;
			}
			n--;
		}
		return count;
	}
}