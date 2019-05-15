package no22_print_tree_from_top_to_botton;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Solution {
	public ArrayList<Integer> PrintTreeFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return list;
		Deque<TreeNode> deque = new LinkedList<TreeNode>();

		deque.add(root);
		while (!deque.isEmpty()) {
			TreeNode t = deque.pop();
			list.add(t.val);
			if (t.left != null)
				deque.add(t.left);
			if (t.right != null)
				deque.add(t.right);
		}
		return list;
	}
}