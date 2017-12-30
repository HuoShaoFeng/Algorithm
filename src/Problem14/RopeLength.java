package Problem14;

public class RopeLength {

	    public static void main(String[] args) {
	        int len = 10;
	        System.out.println("���ӳ���"+len + "������֮�����Ϊ��"+getMax(len));
	        System.out.println("���ӳ���"+len + "������֮��2���Ϊ��"+getMax2(len));
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
	        multi[3]=3;//��Ϊ3�����������ɵ�����󳤶�֮��������0����

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

	        if(modof3 ==0 ){//��3��n����������3��n�η�
	            for (int i=1;i<=timeof3;++i) {
	                max *= 3;
	            }
	        }
	        if(modof3 ==1 ){//��3��n����1��������3��n-1�η����ٳ���4
	            for (int i=1;i<timeof3;++i){
	                max*=3;
	            }
	            max*=4;
	        }
	        if(modof3 ==2 ){//��3��n����2��������3��n-1�η����ٳ���2
	            for (int i=1;i<=timeof3;++i){
	                max*=3;
	            }
	            max*=2;
	        }
	        return max;
	    }
}
