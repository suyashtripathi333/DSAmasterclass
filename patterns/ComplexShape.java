package patterns;
import java.util.*;

public class ComplexShape {

    static void main (){

        Scanner sc = new Scanner(System.in);

        System.out.println("here is the input ");
        int row = sc.nextInt();
        int col =8;


        // part 1

        for(int i = 1 ; i <= row/2 ; i++){

            //printing first part
            for( int j =1 ; j<=i;j++){
                System.out.print(" * ");
            }

            // printing spaces here
            for(int j = 1; j <= (row-(2*i));j++){
                System.out.print("   ");
            }

            for( int j =1 ; j<=i;j++){
                System.out.print(" * ");
            }




            System.out.println();
        }

        //part 2

        for( int i = 1 ; i <= row/2; i++){

            //star part
            for( int j = 1 ; j<=((2 * (row/2))-i)-3;j++){
                System.out.print(" * ");

            }

            // printing spaces

            for( int j = 1 ; j <= (2*i)-2;j++){
                System.out.print("   ");

            }

            for( int j = 1 ; j<=((2 * (row/2))-i)-3;j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }


}
