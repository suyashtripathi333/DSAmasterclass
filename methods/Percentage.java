package methods;

import java.util.Scanner;

public class Percentage {

    static float  per(int obt , int tot){
//
//        System.out.println(obt);
//        System.out.println(tot);
        float result = ((obt*100)/tot);
        return result;
    }


    static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.println("input obtained number here");
        int a = sc.nextInt();

        System.out.println("Input  the total number  here ");
        int b = sc.nextInt();

        float result =per(a,b);
        System.out.println("The percentage you got  "+result + "%");
    }
}
