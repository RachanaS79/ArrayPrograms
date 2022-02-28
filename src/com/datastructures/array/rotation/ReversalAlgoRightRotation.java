package com.datastructures.array.rotation;

/*
time complexity = O(n)
 */
public class ReversalAlgoRightRotation {

    static void rightRotate(int arr[], int d, int n){

        int p = n - d;
        reverse(arr, 0, p-1);
        reverse(arr, p, n-1);
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
        rightRotate(arr, d, n);
        System.out.println("printing an array");
        for(int i = 0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
