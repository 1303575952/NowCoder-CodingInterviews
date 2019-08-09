package no18_mirror_tree;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class Solution {
    public void mirrorTree(TreeNode node) {
        TreeNode temp;
        if (node != null) {
            temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        if (node.left != null) {
            mirrorTree(node.left);
        }
        if (node.right != null) {
            mirrorTree(node.right);
        }
    }
}
