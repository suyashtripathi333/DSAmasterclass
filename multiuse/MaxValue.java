package multiuse;

public class MaxValue {

    public  static int max(int[] arr){
        int  mx = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++){
            if(mx<arr[i]){
                mx = arr[i];
            }
        }
        return mx;
    }
}
