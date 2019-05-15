package no5_realize_queue_by_two_stack;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int num) {
        stack1.push(num);
    }

    public int pop(int num) {
        if (stack1.empty() && stack2.empty()) {
            throw new RuntimeException("queue is empty");
        }
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        int numPop = stack2.pop();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return numPop;
    }
}
