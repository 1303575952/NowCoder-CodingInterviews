package reorder_array;

/*
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
 */
public class Solution {
	/*
	 * ��ð������ǳ���
	 */
	public void reOrderArray(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
					int t = array[j];
					array[j] = array[j + 1];
					array[j + 1] = t;
				}
			}
		}
	}
}