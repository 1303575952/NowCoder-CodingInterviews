package return_list_from_tail_to_head;

import java.util.ArrayList;

/*
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */


/*
 * 不使用栈，原地反转链表
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
