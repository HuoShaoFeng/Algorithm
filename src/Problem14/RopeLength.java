package Problem14;

public class RopeLength {

	    public static void main(String[] args) {
	        int len = 10;
	        System.out.println("绳子长："+len + "，各段之积最大为："+getMax(len));
	        System.out.println("绳子长："+len + "，各段之积2最大为："+getMax2(len));
	    }

	    public static int getMax(int length){
	        if (2>length)
	            return 0;
	        else if (2==length)
	            return 1;
	        else if (3==length)
	            return 2;

	        int[] multi = new int[length+1];
	        multi[0]=0;
	        multi[1]=1;
	        multi[2]=2;
	        multi[3]=3;//长为3的绳子切若干刀的最大长度之积（包含0刀）

	        for (int i = 4; i <= length; i++) {
	            int max = 0;
	            for (int j = 1; j <= i/2; j++) {
	                if (max < multi[j]*multi[i-j])
	                    max =  multi[j]*multi[i-j];
	            }
	            multi[i]=max;
	        }
	        return multi[length];
	    }

	    public static int getMax2(int len) {
	        int max = 1;
	        if (2 > len)
	            return 0;
	        if (2 == len)
	            return 1;
	        if (3 == len)
	            return 2;

	        int timeof3 = len/3;
	        int modof3 = len%3;

	        if(modof3 ==0 ){//是3的n倍，则结果是3的n次方
	            for (int i=1;i<=timeof3;++i) {
	                max *= 3;
	            }
	        }
	        if(modof3 ==1 ){//是3的n倍余1，则结果是3的n-1次方，再乘以4
	            for (int i=1;i<timeof3;++i){
	                max*=3;
	            }
	            max*=4;
	        }
	        if(modof3 ==2 ){//是3的n倍余2，则结果是3的n-1次方，再乘以2
	            for (int i=1;i<=timeof3;++i){
	                max*=3;
	            }
	            max*=2;
	        }
	        return max;
	    }
}
