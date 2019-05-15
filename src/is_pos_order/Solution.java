package is_pos_order;

/*
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No��
 * �������������������������ֶ�������ͬ��
 */
public class Solution {
	public boolean verifyPosOrderOfBST(int[] sequence) {
		if (sequence.length == 0) {
			return false;
		}
		return isPosOrderOfBST(sequence, 0, sequence.length - 1);
	}

	public boolean isPosOrderOfBST(int[] sequence, int start, int end) {
		if (end <= start) {
			return true;
		}
		int i = start;
		for (; i < end; i++) {
			if (sequence[i] > sequence[end])
				break;
		}
		for (int j = i; j < end; j++) {
			if (sequence[j] < sequence[end])
				return false;
		}
		return isPosOrderOfBST(sequence, start, i - 1) && isPosOrderOfBST(sequence, i, end - 1);
	}
}
