package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(getSum(n));

    }

    static int getSum(int n){

        if(n == 0)
            return 0;
        return n + getSum(n-1);
    }
}
