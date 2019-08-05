package no61_serialize_tree;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 */
public class Solution {
    private int index = -1;

    String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }

        sb.append(root.val + ",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }

    TreeNode Deserialize(String str) {
        TreeNode node = null;
        index++;
        String[] strr = str.split(",");
        if (strr[index] != "#") {
            node = new TreeNode(Integer.valueOf(strr[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
}
