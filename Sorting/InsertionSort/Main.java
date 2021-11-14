package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {2,4,8,9,3,5,6,1};
        int n = a.length;

        for( int i = 1 ; i < n ; i++){
            int temp = a[i];
            int j = i-1;
            while(j >= 0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=temp;
        }
        for(int i = 0 ; i < n ; i++ ){
            System.out.print(a[i]  + " ");
        }

    }
}
