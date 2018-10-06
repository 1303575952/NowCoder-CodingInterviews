package ugly_number;

/*
 * ��ֻ����������2��3��5��������������Ugly Number����
 * ����6��8���ǳ�������14���ǣ���Ϊ������������7��
 *  ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 */
public class Solution {
	public int GetUglyNumber_Solution(int index) {

		if (index <= 0)
			return 0;
		int[] result = new int[index];
		int count = 0;
		int i2 = 0;
		int i3 = 0;
		int i5 = 0;

		result[0] = 1;
		int tmp = 0;
		while (count < index - 1) {
			tmp = min(result[i2] * 2, min(result[i3] * 3, result[i5] * 5));
			if (tmp == result[i2] * 2)
				i2++;// ����if��ֵֹ��һ���ģ���Ҫ�ĳ�else��
			if (tmp == result[i3] * 3)
				i3++;
			if (tmp == result[i5] * 5)
				i5++;
			result[++count] = tmp;
		}
		return result[index - 1];
	}

	private int min(int a, int b) {
		return (a > b) ? b : a;
	}
}