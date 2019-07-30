package no62_kth_node;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 例如，（5，3，7，2，4，6，8）中，按结点数值大小顺序第三小结点的值为4。
 */
public class Solution {
    int index = 0; //计数器

    TreeNode kthNode(TreeNode root, int k) {
        if (root != null) { //中序遍历寻找第k个
            TreeNode node = kthNode(root.left, k);
            if (node != null)
                return node;
            index++;
            if (index == k)
                return root;
            node = kthNode(root.right, k);
            if (node != null)
                return node;
        }
        return null;
    }
}
