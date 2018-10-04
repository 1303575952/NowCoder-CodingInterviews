package return_list_from_tail_to_head;

import java.util.ArrayList;

/*
 * ����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��
 */


/*
 * ��ʹ��ջ��ԭ�ط�ת����
 */

public class Solution1 {
	public static ArrayList<ListNode> printListFromTailToHead(ListNode listNode) {
		ArrayList<ListNode> list = new ArrayList<ListNode>();
		ListNode pre = null;
		ListNode next = null;
		while (listNode != null) {
			next = listNode.next;
			listNode.next = pre;
			pre = listNode;
			listNode = next;
		}
		while (pre != null) {
			list.add(pre);
			pre = pre.next;
		}
		return list;
	}

	public static void main(String[] args) {
		ListNode listNode = new ListNode(0);
		listNode.next = new ListNode(1);
		listNode.next.next = new ListNode(2);
		listNode.next.next.next = new ListNode(3);
		listNode.next.next.next.next = new ListNode(4);
		ArrayList<ListNode> list = printListFromTailToHead(listNode);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).val + " ");
		}
	}
}
