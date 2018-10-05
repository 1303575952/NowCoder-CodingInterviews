package sub_tree;

public class Solution {
	/*
	 * node2是否为node1的子树
	 */
	public static boolean isSubTree(TreeNode node1, TreeNode node2) {
		if (node2 == null) {
			return true;
		}
		if (node1 == null && node2 != null) {
			return false;
		}
		if (node1.val == node2.val) {
			return isSubTree(node1.left, node2.left) && isSubTree(node1.right, node2.right);
		} else {
			return false;
		}
	}

	public boolean hasSubTree(TreeNode node1, TreeNode node2) {
		if (node2 == null) {
			return false;
		}
		if (node1 == null && node2 != null) {
			return false;
		}
		boolean flag = false;
		if (node1.val == node2.val) {
			flag = isSubTree(node1, node2);
		}
		if (!flag) {
			flag = hasSubTree(node1.left, node2);
			if (!flag) {
				flag = hasSubTree(node1.right, node2);
			}
		}
		return flag;
	}
}
