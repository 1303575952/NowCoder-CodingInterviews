package rebuild_by_pre_and_in;
/*
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
 */
public class Solution {
	public static TreeNode rebuildBinaryTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
		if(preStart>preEnd||inStart>inEnd){
			return null;
		}
		TreeNode treeNode = new TreeNode(pre[0]);
		for(int i=inStart;i<=inEnd;i++){
			if(in[i]==pre[preStart]){
				treeNode.left = rebuildBinaryTree(pre, preStart+1, preStart+i-inStart, in, inStart, i-1	);
				treeNode.right = rebuildBinaryTree(pre, preStart+i-inStart+1, preEnd, in, i+1, inEnd);
				break;
			}
		}
		return treeNode;
	}
	public static void main(String[] args) {
		
	}
}
