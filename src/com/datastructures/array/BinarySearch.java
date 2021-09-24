package com.datastructures.array;

import java.util.Scanner;
//search element in sorted array
public class BinarySearch {

    static int binarySearch(int arr[], int x, int low, int high){

        int mid = (low + high)/2;

        if(arr[mid] == x)
            return mid;

        if(arr[mid] > x){
            return binarySearch(arr, x, low, mid-1);
        }

            return binarySearch(arr, x, mid+1, high);

    }
    public static void main(String[] args){

        int arr[] = {10, 20, 30, 40};
        int length = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element to be search");
        int x = sc.nextInt();

        int res = binarySearch(arr, x, 0, length-1);
        System.out.println("index of the element is: "+res);
    }
}
