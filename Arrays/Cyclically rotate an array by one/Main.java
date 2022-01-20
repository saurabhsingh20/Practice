package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   //Creating array
        Scanner sc = new Scanner(System.in)
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i< arr.length;i++)
            arr[i] = sc.nextInt();
        //function calling
        RotateByOne(arr);
        print(arr);
    }

     static void RotateByOne(int[] arr){
        int i = 0 , j = arr.length-1;
        while (i != j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;

        }
     }

     static void print(int[] arr){
        for(int i = 0 ; i < arr.length ; i++)
            System.out.print(arr[i] + " ");
     }
}
