package Problem34;

import java.util.List;
import java.util.Stack;

public class PathSum {

	public static void main(String[] args) {
		

	}
	
	public static void findPath(TreeNode root,int sum) {
		if(root==null)
			return;
		Stack<Integer> path = new Stack<>();
		int cur = 0;
		findPath(root,sum,path,cur);
	}

	public static void findPath(TreeNode root,int sum,Stack<Integer> path,int cur) {
		cur += root.data;
		path.push(root.data);
		
		//�����Ҷ�ӽڵ㣬��·���ϵ����нڵ��ֵ�ĺ͵��������ֵ�����ӡ��·��
		boolean isLeaf = root.left==null && root.right==null;
		if(cur==sum && isLeaf) {
			System.out.print("A path is found: ");
			for (Integer x : path) {
				System.out.print(x+"  ");
			}
			System.out.println();
		}
		
		//�����Ҷ�ӽڵ㣬�������Ҷ�ӽڵ�
		if(root.left!=null)
			findPath(root.left,sum,path,cur );
		if(root.right!=null)
			findPath(root.right,sum,path,cur );
		
		path.pop();
	}
}
