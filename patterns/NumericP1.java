package patterns;

import java.util.*;

public class NumericP1 {

    static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Here give the input ");
        int row = sc.nextInt();


        for(int i = 1 ; i <= row ; i++){

            for(int j = 1 ; j <= i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
