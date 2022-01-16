package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        int N = 5;
        int K = 3;
        Bit(N,K);

    }

   public static void Bit(int N , int K){
        if(((N>>(K-1))&1)==1)
            System.out.println("yes");
            else
            System.out.println("no");
    }
}
