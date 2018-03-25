package Problem45;

import java.util.Arrays;

public class ArrayToMinNum {
	
	public static void main(String[] args) {
		int[] arr = {103,301,32};
		
		System.out.println("Min = "+getMin(arr));
	}

	private static String getMin(int[] arr) {
		
		//将整数数组转换为字符串数组
		String[] strArr = new String[arr.length];
		for(int i=0;i<arr.length;++i) {
			strArr[i] = arr[i]+"";
		}
		//对字符串数组进行升序排序,冒泡排序
		for(int i=0;i<strArr.length;++i) {
			for(int j=0;j+1 <strArr.length-i;++j) {
				
				if(strArr[j].compareTo(strArr[j+1])>0) {
					String tmp = strArr[j];
					strArr[j]=strArr[j+1];
					strArr[j+1]=tmp;
				}
			}
		}
		
		String tmp = strArr[0]+"";
		for(int i=1;i<strArr.length;++i) {
			String tmp1 = tmp+strArr[i];
			String tmp2 = strArr[i]+tmp;
			tmp = tmp1.compareTo(tmp2)>0?tmp2:tmp1;
			
		}
		return tmp;
	}
	
	
	
	/*
	private static String getMin(int[] arr) {
		if(arr==null || arr.length<1)
			return "";
		
		//将整数数组转换为字符串数组
		String[] strArr = new String[arr.length];
		for(int i=0;i<arr.length;++i) {
			strArr[i] = arr[i]+"";
		}
		
		//对字符串数组进行升序排序,冒泡排序
		for(int i=0;i<strArr.length;++i) {
			for(int j=0;j+1 <strArr.length-i;++j) {
				
				if(strArr[j].length()>strArr[j+1].length()) {
					String tmp = strArr[j];
					strArr[j]=strArr[j+1];
					strArr[j+1]=tmp;
				}
				
				else if(strArr[j].length()==strArr[j+1].length() && strArr[j].compareTo(strArr[j+1]) < 0 ) {
					
					String tmp = strArr[j];
					strArr[j]=strArr[j+1];
					strArr[j+1]=tmp;
				}
			}
		}
		System.out.println("321".compareTo("32"));
		
		System.out.println("排序后的字符串数组：");
		for (String string : strArr) {
			System.out.println(string);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=strArr.length-1 ; i>=0; --i) {
			sb.append(strArr[i]);
		}
		return sb.toString();
	}
	*/
	
	
	
	

}
