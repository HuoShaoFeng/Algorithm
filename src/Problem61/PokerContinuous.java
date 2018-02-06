package Problem61;

import java.util.Arrays;

/**
 * �˿����е�˳��
 * @author huosf
 *
 */
public class PokerContinuous {

	public static void main(String[] args) {
		int[] arr = {3,0,7,0,4};
		
		System.out.println(isContinuous(arr));

	}

	public static boolean isContinuous(int[] arr) {
		if(arr==null || arr.length<1)
			return false;
		Arrays.sort(arr);

		int numZero = 0;
		int numGap = 0;
		//ͳ��������0�ĸ���
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0)
				numZero++;
		}
		//ͳ�������м����
		int small = numZero;//small�����������е�һ����Ϊ0���±꿪ʼ
		int big = small +1;
		while(big<arr.length) {
			if(arr[small]==arr[big])//���ӳ��֣��϶�����˳��
				return false;
			numGap += arr[big]-arr[small]-1;
			small = big;
			big++;
		}
		if(numZero>=numGap)
			return true;
		
		return false;
	}

}
