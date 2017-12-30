package Problem08;


class TreeNode{
	char value;
	TreeNode left;
	TreeNode right;
	TreeNode parent;
	public TreeNode(char value) {
		super();
		this.value = value;
	}
}

public class NextNode {
	
	public static void main(String[] args) {
		
		//构建树
		TreeNode root = new TreeNode('a');
		TreeNode nb = new TreeNode('b');
		TreeNode nd = new TreeNode('d');
		TreeNode ne = new TreeNode('e');
		TreeNode nh = new TreeNode('h');
		TreeNode ni = new TreeNode('i');
		TreeNode nc = new TreeNode('c');
		TreeNode nf = new TreeNode('f');
		TreeNode ng = new TreeNode('g');
		
		root.left=nb;root.right=nc;root.parent=null;
		nb.parent=root;nb.left=nd;nb.right=ne;
		nd.parent=nb;nd.left=null;nd.right=null;
		ne.parent=nb;ne.left=nh;ne.right=ni;
		nh.parent=ne;nh.left=null;nh.right=null;
		ni.parent=ne;ni.left=null;ni.right=null;
		nc.parent=root;nc.left=nf;nc.right=ng;
		nf.parent=nc;nf.left=null;nf.right=null;
		ng.parent=nc;ng.left=null;ng.right=null;
		
		System.out.println(root.value+"的下一个节点是"+getNextNode(root).value);
		System.out.println(nb.value+"的下一个节点是"+getNextNode(nb).value);
		System.out.println(nc.value+"的下一个节点是"+getNextNode(nc).value);
		System.out.println(nd.value+"的下一个节点是"+getNextNode(nd).value);
		System.out.println(ne.value+"的下一个节点是"+getNextNode(ne).value);
		System.out.println(nf.value+"的下一个节点是"+getNextNode(nf).value);
		System.out.println(nh.value+"的下一个节点是"+getNextNode(nh).value);
		System.out.println(ni.value+"的下一个节点是"+getNextNode(ni).value);
		
		if(null==getNextNode(ng))
			System.out.println(ng.value+"没有下一个节点");
	}
	
	public static TreeNode getNextNode(TreeNode node) {
		if(node==null)
			return null;
		
		TreeNode nxt = null;
		
		//如果有右子树，则从右子节点出发一直找其左子节点
		if(node.right!=null) {
			TreeNode tmp = node.right;
			while(tmp.left!=null) {
				tmp = tmp.left;
			}
			nxt = tmp;
		}
		else if(node.parent!=null) { //没有右子树
			
			TreeNode cur = node;
			TreeNode parent = node.parent;
			if(parent.left == cur)//是其父节点的左子节点
				nxt = parent;
			else{//是其父节点的右子节点
				while(parent!=null && cur==parent.right) {
					cur = parent;
					parent = parent.parent;
				}
				nxt = parent;
			}
		}
		return nxt;
	}
	
}
