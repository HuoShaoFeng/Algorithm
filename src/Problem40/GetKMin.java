package Problem40;

public class GetKMin {

    public static void main(String[] args) {
        int[] arr = {-5,3,2,1,6,-4,7,8};
        int k=4;

        getKthMin(arr, k,0,arr.length-1);

        System.out.println("最小的"+k+"个数是：");
        for (int i=0;i<k;++i){
            System.out.print(arr[i]+",  ");
        }
    }

    private static int getKthMin(int[] arr, int k,int low,int high) {
        int index = Par(arr,low,high);
        if(low<high){
            while (index!=k-1){
                if(index<k-1)
                    index = Par(arr,index+1,high);
                else if(index>k-1)
                    index = Par(arr,low,index-1);
            }
        }
        return arr[index];
    }

    public static int Par(int[] arr,int start,int end){
        int key = arr[start];
        while (start<end){
            while (start<end && arr[end]>=key)
                end--;
            int tmp = arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;

            while (start<end && arr[start]<=key)
                start++;
            tmp = arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;
        }
        return start;
    }

}
