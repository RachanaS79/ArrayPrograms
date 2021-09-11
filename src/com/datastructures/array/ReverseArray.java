package com.datastructures.array;

public class ReverseArray {

    static void reverseArray(int arr[], int n){

        for( int i = 0; i< n/2; i++)
        {
            int t = arr[i] ;
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        }

        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args){
        int arr[] = { 10, 20, 30, 40, 50};
        int n = arr.length;
        reverseArray(arr, n);
    }
}
