package com.company;

public class Main {

    public static void main(String[] args) {

	    int n = 253;
        System.out.println(getSum(n));

    }

    static int getSum(int n){
        if(n==0)
            return 0;
        else
            return getSum(n/10)+n%10;

    }
}
