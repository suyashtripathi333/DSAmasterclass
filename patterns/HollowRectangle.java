package patterns;

import java.util.*;

public class HollowRectangle {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("input the number of row");
        int row = sc.nextInt();

        System.out.println("input the number of col");
        int col = sc.nextInt();



        for(int i = 1 ; i<=row; i++){

            if(i==1 || i==row){
                for(int j = 1; j<=col;j++){
                    System.out.print(" * ");
                }

            }
            else{
                for(int j =1; j<=col; j++){
                    if(j==1 || j==col){
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
            }

            System.out.println();
        }
    }
}
