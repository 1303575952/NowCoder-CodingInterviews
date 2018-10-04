package search_in_array;

/*
 * ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����
 * ÿһ�ж����մ����ҵ�����˳������
 * ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 */
public class Solution {
	public static boolean search(int[][] array, int target) {
		int h = array.length;
		int w = array[0].length;
		int i = h - 1;
		int j = 0;
		while (i >= 0 && j <= w - 1) {
			if (array[i][j] > target) {
				i--;
			} else if (array[i][j] < target) {
				j++;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] array = { { 1, 7, 11, 19 }, { 2, 8, 12, 21 }, { 4, 9, 15, 25 }, { 6, 10, 17, 26 } };
		int target = 12;
		System.out.println(search(array, target));
	}
}
