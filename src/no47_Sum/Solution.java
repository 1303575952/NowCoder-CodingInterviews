package no47_Sum;

/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Solution {
    private int sum(int n) {
        int sum = n;
        boolean ans = (n > 0) && ((sum += sum(n - 1)) > 0);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().sum(10));
    }
}
