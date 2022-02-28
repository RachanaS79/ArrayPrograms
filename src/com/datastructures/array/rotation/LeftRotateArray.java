package com.datastructures.array.rotation;

import java.util.Scanner;
/*
time complexity = O(n*d)
space complexity = O(1)
 */
public class LeftRotateArray {

    public static void leftRotate(int arr[], int d, int n){

        for (int i = 0; i<d; i++){
            leftRotateByOne(arr, n);
        }
    }

    public static void leftRotateByOne(int arr[], int n){
        int temp = arr[0];
        for(int i = 0; i<n-1; i++){
            arr[i] = arr[i +1];
        }
         arr[n-1] = temp;
    }

    public static void main(String[] args){

        int arr[] = {1, 2, 3, 5, 6, 7};
        int n = arr.length;
        System.out.println("Enter the number of elements to be rotated");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        leftRotate(arr, d, n);

        System.out.println("printing an array");
        for(int i = 0; i<n ; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
