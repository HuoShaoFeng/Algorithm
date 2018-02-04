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
		
		//如果是叶子节点，且路径上的所有节点的值的和等于输入的值，则打印此路径
		boolean isLeaf = root.left==null && root.right==null;
		if(cur==sum && isLeaf) {
			System.out.print("A path is found: ");
			for (Integer x : path) {
				System.out.print(x+"  ");
			}
			System.out.println();
		}
		
		//如果非叶子节点，则继续到叶子节点
		if(root.left!=null)
			findPath(root.left,sum,path,cur );
		if(root.right!=null)
			findPath(root.right,sum,path,cur );
		
		path.pop();
	}
}
