package Problem33;

/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ���������
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
		
		int root = seq[end];//������������һ�����Ǹ��ڵ�
		
		//�ڶ����������� �������Ľڵ��ֵ С�ڸø��ڵ��ֵ
		int i = 0;
		for(;i<end;++i) {
			if(seq[i]>root)
				break;
		}
		
		//�ڶ����������� �������Ľڵ��ֵ ���ڸø��ڵ��ֵ
		int j = i;
		for(;j<end;++j) {
			if(seq[j]<root)
				return false; //�����һ���ڵ�С�ڸ��ڵ㣬ֱ�ӷ���false
		}
		
		//�ж��������ǲ��Ƕ���������
		boolean left = true;
		if(i>0)
			left = verifySequenceOfBST(seq,0,i-1);
		
		//�ж��������Ƿ����������
		boolean right = true;
		if(i<end) {
			right = verifySequenceOfBST(seq,i,end-1);
		}
		return left&&right;
	}
	
}
