package methods;
import java.util.*;

public class SumReturn {

    static int printSum(int a , int b){

        int result = a+b;
        return result;

    }
    static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.println("input a here");
        int a = sc.nextInt();

        System.out.println("Input b here ");
        int b = sc.nextInt();

        int result =printSum(a,b);
        System.out.println(result);
    }
}
