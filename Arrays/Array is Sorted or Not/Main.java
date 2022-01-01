package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr ={2,3,5,6,7,8,20};
        System.out.println(isSorted(arr));
        
    }

  static boolean isSorted(int[] arr){
        for(int i=1; i<arr.length;i++)
            if(arr[i]<arr[i-1])
                return false;
            return true;
    }
}
