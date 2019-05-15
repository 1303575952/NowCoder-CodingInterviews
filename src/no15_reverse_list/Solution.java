package no15_reverse_list;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Solution {
    public static ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode reversedHead = null;
        ListNode current = head;
        ListNode tmp = null;
        ListNode pre = null;
        while (current != null) {
            tmp = current.next;
            current.next = pre;
            if (tmp == null)
                reversedHead = current;
            pre = current;
            current = tmp;

        }
        return reversedHead;
    }
}