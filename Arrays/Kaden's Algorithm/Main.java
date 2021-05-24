package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new  int[n];
        for(int i = 0 ; i < arr.length ;i++)
            arr[i] = sc.nextInt();
        MaxSubArray(arr);
    }
    static void MaxSubArray(int[] arr)
    {
        int curSum = 0;
        int maxSum = 0;
        for(int i = 0 ; i< arr.length ; i++)
        {
            curSum = curSum +arr[i];
            if(curSum > maxSum)
            {
                maxSum = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }
        System.out.print(maxSum);
    }
}
