package no60_level_print;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class Solution {
    ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        if (pRoot == null)
            return ret;
        q.add(pRoot);
        int now = 1, next = 0;
        while (!q.isEmpty()) {
            TreeNode t = q.remove();
            now--;
            tmp.add(t.val);
            if (t.left != null) {
                q.add(t.left);
                next++;
            }
            if (t.right != null) {
                q.add(t.right);
                next++;
            }
            if (now == 0) {
                ret.add(new ArrayList<Integer>(tmp));
                tmp.clear();
                now = next;
                next = 0;
            }
        }
        return ret;
    }
}
