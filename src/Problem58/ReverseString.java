package Problem58;

public class ReverseString {

	public static void main(String[] args) {
		String str = "woshi I am a student. really";
		
		//���
		System.out.println(reverseWordOrder(str));

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
