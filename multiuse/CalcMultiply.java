package multiuse;

public class CalcMultiply {

     public static int Mult(int[] arr){
        int prod =1;

        for(int i =0; i<arr.length; i++){
            prod = prod * arr[i];
        }

        return prod;
    }
}
