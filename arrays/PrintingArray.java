package arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class PrintingArray {

    static void main(){

        Scanner sc = new Scanner(System.in);

        //taking length input here
        System.out.println("enter the length of array");
        int n = sc.nextInt();

        //initialized array here
        int[] arr = new int[n];

        // now taking input from user here for the array index
        for(int i =0; i<n;i++){

            System.out.println("Enter the value for array against idx : "+i);
            arr[i]= sc.nextInt();
        }

        //now printitng the input arr with help of for each loop

        for(int val : arr){
            System.out.print(val);
        }
    }


}
