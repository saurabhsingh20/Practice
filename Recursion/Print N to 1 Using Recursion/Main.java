package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printNto1(5);
    }
    static void printNto1(int n){

        if(n==0)
            return;
        System.out.print(n + " ");
        printNto1(n-1);

    }
}
