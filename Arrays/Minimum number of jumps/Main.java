package com.Saurabh;

public class Main {

    public static void main(String[] args) {
       
        int[] arr = {1, 4, 3, 2, 6, 7};
        System.out.println(Jumps(arr));

    }

    static int Jumps(int[] arr) {

        int jumps = 0, currend = 0, currfar = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            currfar = Math.max(currfar, i + arr[i]);
            if (i == currend) {
                jumps++;
                currend = currfar;
            }
            if (currend >= arr.length - 1)
                break;
        }
        if (currend < -1) return -1;
        return jumps;
    }
}


