package methods;

import java.util.*;

public class CheckEven {

    static boolean isEven(int num){
        if(num%2==0){
            return true;

        }
        else{
            return false;
        }
    }

    static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.println("input the number here : ");
        int num = sc.nextInt();

        boolean result = isEven(num);
        System.out.println("The number is even : "+result);
    }
}
