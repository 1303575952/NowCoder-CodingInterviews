package return_list_from_tail_to_head;

import java.util.ArrayList;
/*
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */

public class Solution2 {
	static ArrayList<ListNode> arrayList = new ArrayList<ListNode>();

	public static ArrayList<ListNode> printListFromTailToHead(ListNode listNode) {
		if (listNode != null) {
			printListFromTailToHead(listNode.next);
			arrayList.add(listNode);
		}
		return arrayList;
	}

	public static void main(String[] args) {
		ListNode listNode = new ListNode(0);
		listNode.next = new ListNode(1);
		listNode.next.next = new ListNode(2);
		listNode.next.next.next = new ListNode(3);
		listNode.next.next.next.next = new ListNode(4);
		printListFromTailToHead(listNode);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i).val + " ");
		}
	}
}
