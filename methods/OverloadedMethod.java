package methods;

import java.util.Scanner;

public class OverloadedMethod {

    static int printSum(int a , int b){

        int result = a+b;
        return result;

    }
    // Show casing method overloading here -> same name  of method but parameter should be different like different data type or in number
    static int printSum(int a , int b , int c){

        int result = a+b+c;
        return result;

    }


    static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.println("input a here");
        int a = sc.nextInt();

        System.out.println("Input b here ");
        int b = sc.nextInt();

        System.out.println("Input c here ");
        int c = sc.nextInt();

        int result =printSum(a,b);
        int result2 = printSum(a,b,c);
        System.out.println(result2);
        System.out.println(result);
    }
}
