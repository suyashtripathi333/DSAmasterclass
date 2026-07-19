package patterns;

import java.util.Scanner;

public class NumericP2 {

    static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Here give the input ");
        int row = sc.nextInt();

        int k =1 ;
        for(int i = 1 ; i <= row ; i++){

            for(int j = 1 ; j <= i ; j++){
                System.out.print(k + " ");
                k= k+1;
            }
            System.out.println();
        }
    }
}
