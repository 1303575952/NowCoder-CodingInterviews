package jump_floor;

/*
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
 */
public class Solution {
	public int jumpFloor(int target) {
		if (target <= 0) {
			return -1;
		} else if (target == 1) {
			return 1;
		} else if (target == 2) {
			return 2;
		} else {
			return jumpFloor(target - 1) + jumpFloor(target - 2);
		}
	}
}
