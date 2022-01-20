package com.company;
public class Main {

    public static void main(String[] args) {

        int[] price = {1,2,3,4,5,6,7,8,14};
        int n = price.length;
        System.out.println(MaxProfit(price,n));

    }

    static int MaxProfit(int[] price, int n){

        int profit = 0;
        for(int i = 1 ; i < n ; i++)
            if(price[i]>price[i-1])
                profit += (price[i] - price[i-1]);
            return profit;

    }
}
