package no37_number_of_k;

/**
 * 统计一个数字在排序数组中出现的次数。
 */
public class Solution {
    public int getNumberOfK(int[] array, int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k)
                count++;
        }
        return count;
    }
}