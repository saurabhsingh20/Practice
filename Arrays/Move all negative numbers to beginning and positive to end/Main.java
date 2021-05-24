package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = { -12, 11, -13, -5,
                6, -7, 5, -3, 11 };

        int arr_size = arr.length;


        moveNegative(arr, 0, arr_size - 1);
        print(arr, arr_size - 1);
    }


    static void moveNegative(int[] arr,int left, int right)
    {
        while(left<=right)
        {
            if ((arr[left]<0 && arr[right]<0))
                left++;
            else if(arr[left]>0 && arr[right]<0)
            {
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if (arr[left] > 0 && arr[right] > 0)
                right--;
            else
            {
                left++;
                right--;
            }

        }
    }
    static void print(int[] arr, int right)
    {


        for(int i = 0; i <= right; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


}
