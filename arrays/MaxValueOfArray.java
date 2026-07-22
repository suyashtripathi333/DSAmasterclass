package arrays;

import multiuse.MaxValue;

import java.util.Scanner;

public class MaxValueOfArray {

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

        int result = MaxValue.max(arr);
        System.out.println("This is the maximum value of the array: "+result);
    }
}
