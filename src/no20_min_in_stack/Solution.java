package no20_min_in_stack;

import java.util.Stack;
import java.util.Arrays;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Solution {
    private int size;
    private int min = Integer.MAX_VALUE;
    private Stack<Integer> minStack = new Stack<Integer>();
    private Integer[] elements = new Integer[10];

    public void push(int node) {
        ensureCapacity(size + 1);
        elements[size++] = node;
        if (node <= min) {
            minStack.push(node);
            min = minStack.peek();
        } else {
            minStack.push(min);
        }
        //    System.out.println(min+"");
    }

    private void ensureCapacity(int size) {
        // TODO Auto-generated method stub
        int len = elements.length;
        if (size > len) {
            int newLen = (len * 3) / 2 + 1; //每次扩容方式
            elements = Arrays.copyOf(elements, newLen);
        }
    }

    public void pop() {
        Integer top = top();
        if (top != null) {
            elements[size - 1] = (Integer) null;
        }
        size--;
        minStack.pop();
        min = minStack.peek();
        //    System.out.println(min+"");
    }

    public int top() {
        if (!empty()) {
            if (size - 1 >= 0)
                return elements[size - 1];
        }
        return (Integer) null;
    }

    public boolean empty() {
        return size == 0;
    }

    public int min() {
        return min;
    }
}