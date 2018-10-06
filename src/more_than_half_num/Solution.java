package more_than_half_num;

import java.util.Arrays;

/*
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 * 如果不存在则输出0。
 */
/*
 * 如果存在，那么这个数必然是排序好的数组中间的数
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
