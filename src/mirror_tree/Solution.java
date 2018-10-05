package mirror_tree;

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
