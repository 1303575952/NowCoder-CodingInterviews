package no3_return_list_from_tail_to_head;

import java.util.ArrayList;
import java.util.Stack;
/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */

/**
 * 非递归
 * 用栈
 */
public class Solution2 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack = new Stack<ListNode>();
        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!stack.empty()) {
            list.add(stack.peek().val);
            stack.pop();
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next = new ListNode(5);
        ArrayList<Integer> list = new Solution2().printListFromTailToHead(listNode);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
