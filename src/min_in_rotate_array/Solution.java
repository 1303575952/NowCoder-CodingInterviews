package min_in_rotate_array;

/*
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 * ����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� 
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
public class Solution {
	public int minNumberInRotateArray(int[] array) {
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (array[mid] > array[high]) {
				low = mid + 1;
			} else if (array[mid] == array[high]) {
				high = high - 1;
			} else {
				high = mid;
			}
		}
		return array[low];
	}
}
