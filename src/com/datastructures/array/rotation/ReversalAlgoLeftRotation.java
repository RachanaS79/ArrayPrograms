package com.datastructures.array.rotation;

/*
time complexity = O(n)
 */
public class ReversalAlgoLeftRotation {

    static void leftRotate(int arr[], int d, int n){

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    static void reverse(int arr[], int start, int end){

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6};
        int d = 2;
        int n = arr.length;
        leftRotate(arr, d, n);
        System.out.println("printing an array");
        for(int i = 0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
