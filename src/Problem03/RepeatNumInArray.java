package Problem03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * ��һ������Ϊn����������������ֶ��� 0~ n-1 �ķ�Χ�ڣ�������ĳЩ�������ظ��ģ�
 * ����֪�����������ظ��ˣ�Ҳ��֪��ÿ�������ظ��˼��Σ��ҳ�����������һ���ظ������֡�
 * ���糤��Ϊ7������{2��3��1��0��2��5��3}�����Ӧ����2��3.
 */
public class RepeatNumInArray {

	public static void main(String[] args) {
		int[] srcArray = new int[]{9,3,1,6,0,4,5};
//		int tmp = findRepeatNumByHash(srcArray);
//		int tmp = findRepeatNumByOrder(srcArray);
		int tmp = findRepeatNum(srcArray);
		System.out.println(tmp);

	}
	
	public static int findRepeatNum(int[] arr){
		int ret = -1;
		if(arr.length<=0)//���鳤�Ȳ��Ϸ�
			return -1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0 || arr[i]>arr.length-1)//��ֵԽ��
				return -1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			while(arr[i]!=i){
				if(arr[i]==arr[arr[i]]){	//�±�Ϊi���±�Ϊarr[i]��ֵһ����˵�����ظ�������
					ret = arr[i];
					return ret;
				}
				
				//arr[i] ��= arr[arr[i]]
				int tmp = arr[i];
				arr[i]=arr[tmp];
				arr[tmp]=tmp;
			}
		}
		return ret;
	}
	
	
	
	public static int findRepeatNumByOrder(int[] arr){
		int ret = -1;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]){
				ret = arr[i];
				break;
			}
		}
		return ret;
	}
	
	
	
	public static int findRepeatNumByHash(int[] arr){
		int ret=-1;
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i]))	//���δ���ֹ�
				map.put(arr[i], 100);
			else{	//���ֹ���
				ret = arr[i];
				break;
			}
		}
		return ret;
	}
}
