package more_than_half_num;

import java.util.Arrays;

/*
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2��
 * ��������������0��
 */
/*
 * ������ڣ���ô�������Ȼ������õ������м����
 */
public class Solution {
	public int MoreThanHalfNum_Solution(int[] array) {
		int len = array.length;
		if (len < 1) {
			return 0;
		}
		int count = 0;
		Arrays.sort(array);
		int num = array[len / 2];
		for (int i = 0; i < len; i++) {
			if (num == array[i])
				count++;
		}
		if (count <= (len / 2)) {
			num = 0;
		}
		return num;
	}
}
