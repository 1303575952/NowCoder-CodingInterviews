package no1_search_in_array;

/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

/**
 * 思考：如果其中不存在该整数，执行流程会是怎样？
 * 一步步走出循环
 */
public class Solution {
    public boolean Find(int target, int[][] array) {
        int i = array.length - 1;
        int j = 0;
        while (i >= 0 && j <= array[0].length - 1) {
            if (array[i][j] > target) {
                i--;
            } else if (array[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 7, 11, 19}, {2, 8, 12, 21}, {4, 9, 15, 25}, {6, 10, 17, 26}};
        int target = 12;
        System.out.println(new Solution().Find(target, array));
    }
}
