package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< arr.length ; i++)
            arr[i] = sc.nextInt();
        System.out.println(duplicate(arr));
    }
     static int duplicate(int[] arr){
         int slow = arr[0];
         int fast = arr[0];
         do {
             slow = arr[slow];
             fast = arr[arr[fast]];
         } while (slow != fast);


         slow = arr[0];
         while (slow != fast) {
             slow = arr[slow];
             fast = arr[fast];
         }

         return fast;
     }
}
