package Problem58;

public class ReverseString {

	public static void main(String[] args) {
		String str = "woshi I am a student. really";
		
		//���
//		System.out.println("��ת����֮���˳�� "+reverseWordOrder(str));

		String s = "abcdefg";
		int n=2;
		//����ת�ַ�������Ϊcdefgab
		System.out.println("����ת�ַ����� "+leftRotateString(s,n));
		
	}

	//����ת�ַ�����abcdefg��Ϊcdefgab
	private static String leftRotateString(String s, int n) {
		
		if(s==null || s.length()<2 || n<1 || s.length()<=n)
			return s;
		
		//�����ַ�����ת
		char[] charArray = s.toCharArray();
		reverse(charArray, 0, charArray.length-1);
		
		//��ת���
		reverse(charArray, 0, charArray.length-n-1);
		
		//��ת�Ҷ�
		reverse(charArray, charArray.length-n, charArray.length-1);
		
		System.out.println("test: "+new String(charArray));
		return new String(charArray);
	}

	private static String reverseWordOrder(String str) {
		if(str==null)
			return "";
		char[] charArray = str.toCharArray();
		if(charArray.length<=1)
			return new String(charArray);
		
		//��ת��������
		reverse(charArray, 0, charArray.length-1);
		System.out.println(new String(charArray));
		
		
		//��תÿ������
		int start = 0;
		int end = 0;
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]==' ') {
				end = i-1;
				reverse(charArray, start, end);
				start=i+1;
			}
			if(i==charArray.length-1) {//�״����һ������
				reverse(charArray, start, i);
			}
		}
		return new String(charArray);
	}
	
	//��תһ���ַ���
	public static void reverse(char[] carr,int start,int end) {
		if(carr==null || carr.length<1)
			return;
		if(start<0 || end <0 || start>=end)
			return;
		
		while(start<end) {
			char tmp = carr[start];
			carr[start]=carr[end];
			carr[end]=tmp;
			start++;
			end--;
		}
		
	}

}
