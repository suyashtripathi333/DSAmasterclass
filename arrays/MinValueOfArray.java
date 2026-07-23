package arrays;


import java.util.Scanner;

import multiuse.MinValue;


public class MinValueOfArray {

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
        int result = MinValue.mini(arr);
        System.out.println("Here is the minimum value of array : "+result);
    }
}
