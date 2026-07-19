package patterns;

import  java.util.*;

public class NumberTriangle {

    static void main(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Give input here :");
        int row = sc.nextInt();


        for( int i = 1 ; i <= row ; i++){
            int m=i-1;




            for(int j = 1 ; j <= row -i; j++ ){
                System.out.print(" ");
            }

            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }

            if( i==1){
                System.out.print(" ");
            }
            else{
                for(int j =1; j<=i-1; j++){
                    System.out.print(m);
                    m= m-1;
                }
            }

            System.out.println();


        }


    }
}
