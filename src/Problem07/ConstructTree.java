package Problem07;

class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
}



public class ConstructTree {

	public static void main(String[] args) throws Exception {
		int[] preArr = {1,2,4,7,3,5,6,8};
		int[] midArr = {4,7,2,1,5,3,8,6};
		
		TreeNode retNode = Construct(preArr, midArr);
		System.out.println(retNode.value);
		
		//��ӡ����
		System.out.println("������������");
		printPost(retNode);
	}

	public static TreeNode Construct(int[] pre,int[] mid) throws Exception {
		if(pre.length<1 || mid.length<1)
			return null;
		
		return ConstructCore(pre,0,pre.length-1,mid,0,mid.length-1);
	}

	public static TreeNode ConstructCore
	(int[] pre,int preStart,int preEnd,	int[] mid,int midStart,int midEnd)
												 throws Exception {
		int tmpRoot = pre[preStart];
		
		TreeNode rootNode = new TreeNode();
		rootNode.value = tmpRoot;
		rootNode.left = null;
		rootNode.right = null;
		
		//�����ʣ��һ���ڵ�
		if(preStart==preEnd) {
			if(midStart==midEnd && pre[preStart]==mid[midStart]) {
				return rootNode;
			}
			else {
				throw new Exception("��Ч������");
			}
		}
		
		//�ҵ����ڵ�����������е�λ��
		int index = 0;
		for(int i=midStart;i<=midEnd;++i) {
			if(tmpRoot==mid[i]) {
				index = i;
				break;
			}
		}
		
		int leftCount = index - midStart;
		
		if(leftCount>0) {
			//����������
			rootNode.left = ConstructCore(pre, preStart+1, preStart+leftCount, mid, midStart, index-1);
		}
		if(leftCount < preEnd-preStart) {
			//����������
			rootNode.right = ConstructCore(pre, preStart+leftCount+1, preEnd, mid, index+1, midEnd);
		}
		return rootNode;
	}

	
	public static void printPost(TreeNode root) {
		if(root==null)
			return;
		
		if(root.left!=null)
			printPost(root.left);


		if(root.right!=null)
			printPost(root.right);
		
		System.out.print(root.value+", ");
	}
}
