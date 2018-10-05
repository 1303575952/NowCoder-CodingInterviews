package is_pos_order;

/*
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。
 * 假设输入的数组的任意两个数字都互不相同。
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
