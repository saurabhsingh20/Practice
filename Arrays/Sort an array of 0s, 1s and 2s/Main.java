package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();
        SortArray(arr);
        print(arr);
    }
    static void SortArray(int[] arr)
    {

        int i , c0 = 0 , c1 = 0 , c2=0;

        for (i = 0 ; i < arr.length ; i++) {
            switch (arr[i]) {
                case 0:
                    c0++;
                    break;

                case 1:
                    c1++;
                    break;

                case 2:
                    c2++;
                    break;
            }
        }

        i = 0;

        while (c0 > 0) {
            arr[i++] = 0;
            c0--;
        }

         while (c1 > 0) {
            arr[i++] = 1;
            c1--;
        }

        while (c2 > 0) {
            arr[i++] = 2;
            c2--;
        }

    }
    static void print(int[] arr){
        for(int i = 0 ; i <arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
