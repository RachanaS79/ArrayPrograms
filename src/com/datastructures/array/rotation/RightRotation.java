package com.datastructures.array.rotation;

import java.util.Scanner;

public class RightRotation {

    void rightRotate(int arr[], int d, int n){
        for(int i=0; i<d; i++)
        {
          rightRotateByOne(arr, n);
        }
    }

    void rightRotateByOne(int arr[], int n){
        int temp = arr[n-1];
        for(int i = n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args){

        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("Enter the number of elements it has to be rotated");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        RightRotation obj = new RightRotation();
        obj.rightRotate(arr, d, n);
        System.out.println("printing the elements");
        for(int i =0; i<n; i++)
        {
            System.out.println(arr[i]+ " ");
        }
    }
}
