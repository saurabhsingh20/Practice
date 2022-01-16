package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Print1ToN(5);
    }
    static void Print1ToN(int n){
        if(n==0)
            return;
        Print1ToN(n-1);
        System.out.print(n + " ");
    }
}
