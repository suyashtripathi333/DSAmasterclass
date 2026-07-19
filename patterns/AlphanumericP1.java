package patterns;

import java.util.Scanner;

public class AlphanumericP1 {

    static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Here give the input ");
        int row = sc.nextInt();


        for(int i = 1 ; i <= row ; i++){
            int k =65 ;

            for(int j = 1 ; j <= i ; j++){
                char m = (char)k;
                System.out.print(m + " ");
                k= k+1;
            }
            System.out.println();
        }
    }
}
