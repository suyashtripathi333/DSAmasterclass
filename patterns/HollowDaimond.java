package patterns;
import java.util.*;
public class HollowDaimond {
    static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.println("give the row input here");
        int row = sc.nextInt();

        //part 1 Hollow straight triangle
        for(int i =1; i<=row;i++){

            //printing spaces
            for(int j = 1 ; j <= row-i; j++){
                System.out.print("   ");
            }

            //printing triangular shape star
            for(int j = 1 ; j <= (2*i-1); j++){
                if(j==1 || j==(2*i-1)){
                    System.out.print(" * ");

                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        //Second part of hollow triangle

        int row1 = row -1;

        for( int i = 1 ; i <= row1; i++){

            //printing spaces

            for(int j = 1 ; j <=i-1; j++){
                System.out.print("   ");
            }

            //printing inversted hollow triangle shape

            for(int j = 0 ; j <=(2*row1 -1)-(2*(i-1));j++){
                if (j==1 || j == (2*row1-1)-(2*(i-1))){
                    System.out.print(" * ");

                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }


    }
}
