package com.datastructures.array;

import java.util.HashMap;
import java.util.Map;

public class Seggregate01 {

    static void seggregate(int arr[], int n){

        int count0 = 0;
        int count1 = 0;
       for(int i=0; i<n; i++){
           if(arr[i]==0)
               count0++;
           else
               count1++;

       }
        for(int i=0; i<count0; i++){
            arr[i] = 0;
        }

        for(int i = count0; i<n; i++){
            arr[i] = 1;
        }

        System.out.println("printing the array");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1};
        int n = arr.length;
        seggregate(arr, n);
    }
}
