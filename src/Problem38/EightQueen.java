package Problem38;

/**
 * Created by Needle on 2017/12/10.
 */
public class EightQueen {

    static int count = 0;
    public static void main(String[] args) {
        int[] ColumnIndex = new int[]{0,1,2,3,4,5,6,7};
        permutation(ColumnIndex, 0);
    }

    public static void permutation(int[] arr, int i) {
        if (i >= arr.length)
            return;
        if (i == arr.length - 1) {//递归结束条件

            //System.out.println("== "+String.valueOf(str));	可以输出或做其他处理
            for (int x = 0;x<arr.length;++x){
                for (int y = x+1; y <arr.length ; y++) {
                    if(x-y==arr[x]-arr[y] || y-x==arr[x]-arr[y]){
                        return;//本次八皇后排列不符合要求，直接跳出函数，不输出
                    }
                    else {
                    }
                }
            }//如果没有执行if及return，说明八皇后的本次排列符合要求
            count++;
            printArr(arr);
        } else {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                permutation(arr, i + 1);

                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void printArr(int[] arr){
        System.out.print(count+":   ");
        for (int a:arr
             ) {
            System.out.print(a+", ");
        }
        System.out.println();
    }

    public  static boolean check(int[] arr){
//        for (int x = 0;x<arr.length;++x){
//            for (int y = x+1; y <arr.length ; y++) {
//                if(x-y==arr[x]-arr[y] || y-x==arr[x]-arr[y]){
//                    return false;
//                }
//                else {
//                }
//            }
//        }
//        ++count;
        return true;
    }
}
