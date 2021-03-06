package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] try1 = input.toCharArray();
        for (int i = try1.length - 1 ; i >= 0; i-- )
            System.out.print(try1[i]);
    }
}
