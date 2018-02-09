package Problem56;

/**
 * ������ֻ����һ�ε��������֣�����������������
 * @author huosf
 *
 */
public class NumOccurTimes {

	public static void main(String[] args) {
		int[] arr=  {2,4,3,6,3,2,5,5};
		
		findNumbersAppearOnce(arr);

	}

	private static void findNumbersAppearOnce(int[] arr) {
		int ret = 0;
		for(int i=0;i<arr.length;++i)
			ret^=arr[i];
		System.out.println(ret+"=ret");
		
		//�ҵ�ret�е�һ��bit=1��λ�ã���������
		int index = findFirstBitIs1(ret);
		System.out.println(index);
		int num1=0,num2=0;
		
		//�ж�һ������indexλ�Ƿ���1
		for(int i=0;i<arr.length;++i) {
			if(isBit1(arr[i],index)) 
				num1^=arr[i];
			else
				num2^=arr[i];
		}
		
		System.out.println("the two num is :"+num1+" and "+num2);
		
	}

	private static boolean isBit1(int i, int index) {
//		i = i >>(index-1);
		i = i >>index;//index��0��ʼ���״��
		if((i&1)==1)
			return true;
		return false;
	}

	private static int findFirstBitIs1(int ret) {
		int index = 0;
		while((ret&1)==0 && index<32) {
			ret >>= 1;
			index++;
		}
		return index;		
	}
	
	
	

}
