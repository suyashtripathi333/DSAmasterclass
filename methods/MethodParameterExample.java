package methods;

import java.util.*;

public class MethodParameterExample {

    static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value a");
        int a = sc.nextInt();

        System.out.println("Enter the value b");
        int b = sc.nextInt();

        printSum(a,b);
    }

    static void printSum(int x, int y){

        System.out.println(x+y);
    }

}
