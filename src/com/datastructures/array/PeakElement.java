package com.datastructures.array;

public class PeakElement {

    static int findPeak(int arr[], int low, int high, int n){

        int mid = (low + high)/2;

        if((mid == 0 || arr[mid -1] <= arr[mid]) && (mid == n-1 || arr[mid +1] <= arr[mid]))
        return mid;

        else if (mid > 0 && arr[mid -1] > arr[mid])
           return findPeak(arr, low, (mid -1), n);

        else
            return findPeak(arr, (mid + 1), high, n);
    }

    public static void main(String[] args){
        int arr[] = {1, 3, 20, 4, 1};
        int n = arr.length;
        int m =  findPeak(arr, 0, n-1, n);
        System.out.println("index of peak element is  %d:" +m);
    }
}

// Refer GeeksForGeeks https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/