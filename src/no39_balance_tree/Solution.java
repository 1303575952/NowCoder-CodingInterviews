package no39_balance_tree;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class Solution {
    private boolean isBalanced = true;

    public boolean isBalancedTree(TreeNode root) {

        getDepth(root);
        return isBalanced;
    }

    public int getDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);

        if (Math.abs(left - right) > 1) {
            isBalanced = false;
        }
        return right > left ? right + 1 : left + 1;

    }
}