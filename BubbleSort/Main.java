package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int arr[] = {64, 34, 25, 12, 22, 111 ,90};
        int n = arr.length;
        bubbleSort(arr,n);
       printArray(arr);

    }

    public static void bubbleSort(int arr[],int n)
    {
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j < n-i-1 ; j++){
                if( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
