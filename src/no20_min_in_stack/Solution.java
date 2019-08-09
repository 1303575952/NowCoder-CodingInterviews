package no20_min_in_stack;

import java.util.ArrayList;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Solution {
    private ArrayList<Integer> dataList = new ArrayList<>();
    private ArrayList<Integer> minList = new ArrayList<>();
    private Integer min = Integer.MAX_VALUE;

    public void push(int node) {
        dataList.add(node);
        if (node <= min) {
            minList.add(node);
            min = node;
        } else {
            minList.add(min);
        }
    }

    public int getSize() {
        return dataList.size();
    }

    public void pop() {
        int end = getSize() - 1;
        dataList.remove(end);
        minList.remove(end);
        min = minList.get(getSize() - 1);
    }

    public int top() {
        return dataList.get(getSize() - 1);
    }

    public int min() {
        return min;
    }
}