package patterns;
import java.util.*;

public class Diamond {

    static void main(){

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i =1 ; i<=row; i++){

            for(int j =1; j<=row-i;j++){
                System.out.print("   ");
            }

            for(int j = 1; j<=(2*i-1);j++){
                System.out.print(" * ");
            }
            System.out.println();
        }



        //Second part of daimond is here

        for(int i = 1; i<=row; i++){

            for(int j=1; j<=i;j++){
                System.out.print("   ");
            }

            for(int j =1;j<=(2*row-1)-(2*i);j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
