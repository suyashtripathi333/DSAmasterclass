package methods;

import java.util.*;

public class GetMaximum {

    static int maximum(int a , int b){

        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }

    static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.println("input a here");
        int a = sc.nextInt();

        System.out.println("Input b here ");
        int b = sc.nextInt();

        int result =maximum(a,b);
        System.out.println("This the largest of the two you entered "+result);
    }
}
