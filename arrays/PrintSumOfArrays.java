package arrays;

import java.util.Scanner;

public class PrintSumOfArrays {

    //function to do sum of array
    static int sumArr(int[] arr){
        int sum =0;
        for(int i =0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }

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

        int result = sumArr(arr);

        System.out.println("The sum of the arrays element is : "+ result);


    }
}
