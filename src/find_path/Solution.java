package find_path;

import java.util.ArrayList;

/*
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class Solution {
	private static ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
	private static ArrayList<Integer> list = new ArrayList<Integer>();

	public static ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
		if (root == null) {
			System.out.println("*");
			return listAll;
		}

		list.add(root.val);
		System.out.println("add:" + root.val);
		target -= root.val;
		if (target == 0 && root.left == null && root.right == null)
			listAll.add(new ArrayList<Integer>(list));
		findPath(root.left, target);
		findPath(root.right, target);
		System.out.println("delete:" + list.get(list.size() - 1));
		list.remove(list.size() - 1);
		return listAll;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(9);
		root.left.right.left = new TreeNode(6);
		findPath(root, 17);
		System.out.println("==============================");
		for (int i = 0; i < listAll.size(); i++) {
			for (int j = 0; j < listAll.get(i).size(); j++) {
				System.out.print(listAll.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
