package methods;

import java.util.*;

public class UpdateValue {

    static int upd(int num){
        System.out.println("When come in function "+num);

        num = num*100;
        System.out.println("When after value update "+num);

        return num;
    }

    static void main(){

        int num =15;
        System.out.println("before sending to function "+num);


        int result = upd(num);
        System.out.println("When after the function return  "+result);
        System.out.println("When after the function value returned printed the value of num is  "+num);







    }
}
