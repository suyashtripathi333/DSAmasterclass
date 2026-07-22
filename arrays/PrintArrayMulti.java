package arrays;

import multiuse.CalcMultiply;

import java.util.Scanner;

public class PrintArrayMulti {
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

       // used Mult function from package  multiuse  class CalcMultiply function Mult
        int result = CalcMultiply.Mult(arr);

        System.out.println(result);
    }
}
