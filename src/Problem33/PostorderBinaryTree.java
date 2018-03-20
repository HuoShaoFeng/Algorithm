package Problem33;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果
 * @author huosf
 */
public class PostorderBinaryTree {

	public static void main(String[] args) {
		int[] seq = {7,4,6,5};//{5,7,6,9,11,10,8}
		
		System.out.println(verifySequenceOfBST(seq, 0, seq.length-1));
	}
	
	public static boolean verifySequenceOfBST(int[] seq,int start, int end) {
		if(seq==null || seq.length<=0 )
			return false;
		
		int root = seq[end];//后序遍历中最后一个就是根节点
		
		//在二叉搜索树中 左子树的节点的值 小于该父节点的值
		int i = 0;
		for(;i<end;++i) {
			if(seq[i]>root)
				break;
		}
		
		//在二叉搜索树中 右子树的节点的值 大于该父节点的值
		int j = i;
		for(;j<end;++j) {
			if(seq[j]<root)
				return false; //如果有一个节点小于根节点，直接返回false
		}
		
		//判断左子树是不是二叉搜索树
		boolean left = true;
		if(i>0)
			left = verifySequenceOfBST(seq,0,i-1);
		
		//判断右子树是否二叉搜索树
		boolean right = true;
		if(i<end) {
			right = verifySequenceOfBST(seq,i,end-1);
		}
		return left&&right;
	}
	
}
