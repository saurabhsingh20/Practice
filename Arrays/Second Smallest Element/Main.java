package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secMax = Integer.MIN_VALUE;
        int secMin = Integer.MAX_VALUE;

        Scanner s = new Scanner(System.in);
        max = min = secMax = secMin = s.nextInt();
        while(true){
            System.out.println("Enter a value: ");
            int value = s.nextInt();

            if(value == 0){
                break;
            }

            if(value > secMax){
                if(value > max){
                    secMax = max;
                    max = value;
                }else{
                    secMax = value;
                }
            }

            if(value < secMin){
                if(value < min){
                    secMin = min;
                    min = value;
                }else{
                    secMin = value;
                }
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sec Max " + secMax);
        System.out.println("Sec Min " + secMin);


    }
}

