package patterns;
import java.util.*;

public class HollowRightTriangle {

    static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.println("input the value of row");
        int row = sc.nextInt();


        for(int i =1; i<=row; i++){

            if(i==row){
                for(int j =1; j<=row; j++){
                    System.out.print(" * ");
                }

            }
            else{
                for(int j =1; j<=i;j++){
                    if(j==1 || j==i){
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
