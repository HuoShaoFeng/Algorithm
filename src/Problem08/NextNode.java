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
		
		//������
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
		
		System.out.println(root.value+"����һ���ڵ���"+getNextNode(root).value);
		System.out.println(nb.value+"����һ���ڵ���"+getNextNode(nb).value);
		System.out.println(nc.value+"����һ���ڵ���"+getNextNode(nc).value);
		System.out.println(nd.value+"����һ���ڵ���"+getNextNode(nd).value);
		System.out.println(ne.value+"����һ���ڵ���"+getNextNode(ne).value);
		System.out.println(nf.value+"����һ���ڵ���"+getNextNode(nf).value);
		System.out.println(nh.value+"����һ���ڵ���"+getNextNode(nh).value);
		System.out.println(ni.value+"����һ���ڵ���"+getNextNode(ni).value);
		
		if(null==getNextNode(ng))
			System.out.println(ng.value+"û����һ���ڵ�");
	}
	
	public static TreeNode getNextNode(TreeNode node) {
		if(node==null)
			return null;
		
		TreeNode nxt = null;
		
		//�������������������ӽڵ����һֱ�������ӽڵ�
		if(node.right!=null) {
			TreeNode tmp = node.right;
			while(tmp.left!=null) {
				tmp = tmp.left;
			}
			nxt = tmp;
		}
		else if(node.parent!=null) { //û��������
			
			TreeNode cur = node;
			TreeNode parent = node.parent;
			if(parent.left == cur)//���丸�ڵ�����ӽڵ�
				nxt = parent;
			else{//���丸�ڵ�����ӽڵ�
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
