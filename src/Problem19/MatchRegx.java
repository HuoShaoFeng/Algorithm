package Problem19;

public class MatchRegx {

	public static void main(String[] args) {

		String str = "aaa";
		String pattern = "aa.a";
		
//		System.out.println("0:"+str.substring(0));
//		System.out.println("1:"+str.substring(1));
//		System.out.println("2:"+str.substring(2).length()+",");
		
		boolean ret = match(str,pattern);
		System.out.println(ret);
	}
	
	public static boolean match(String str, String pattern) {
		if(str==null || pattern == null)
			return false;
		
		return matchCore(str, pattern);
	}
	
	
	public static boolean matchCore(String str, String pattern) {
		
		System.out.println(str+", "+pattern);
		System.out.println(str.length()+", "+pattern.length());
		
		if(str.length()==0 && pattern.length()==0)
			return true;
		
		if(str.length()>0 && pattern.length()==0)
			return false;
		
		int s = 0,p=0;
		
		//ģʽ������һ���� ��*��
		if((p+1)<pattern.length() && pattern.charAt(p+1)=='*') {
			if(str.charAt(s)==pattern.charAt(p) || (pattern.charAt(p)=='.'&& str.length()>0)) {
				boolean b = matchCore(str.substring(s+1),pattern.substring(p+2)) ||
						matchCore(str.substring(s+1),pattern.substring(p)) ||
						matchCore(str,pattern.substring(p+2));
				return b;
			}else {
				return matchCore(str,pattern.substring(p+2));
			}
		}
		
		if((str.length()>0&&str.charAt(s)==pattern.charAt(p) )|| (pattern.charAt(p)=='.'&& str.length()>0)) {
			return matchCore(str.substring(s+1),pattern.substring(p+1));
		}
		
		
		return false;
	}
	

}
