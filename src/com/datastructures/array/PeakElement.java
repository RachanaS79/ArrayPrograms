package com.datastructures.array;

public class PeakElement {

    /*
    Time Complexity: O(Logn).
    Where n is the number of elements in the input array. In each step our search becomes half. So it can be compared to Binary search, So the time complexity is O(log n)
    Space complexity: O(1).
    No extra space is required, so the space complexity is constant.
     */
    static int findPeak(int arr[], int low, int high, int n){

        int mid = low + (high - low)/2;

        if((mid == 0 || arr[mid -1] <= arr[mid]) && (mid == n-1 || arr[mid +1] <= arr[mid]))
        return mid;

        // if mid is not peak element
        else if (mid > 0 && arr[mid-1] > arr[mid]){
            return findPeak(arr, low, mid-1, n);
        }
        else
            return findPeak(arr, mid+1, high, n);
    }

    public static void main(String[] args){
        int arr[] = {1, 3, 20, 4, 1};
        int n = arr.length;
        int m =  findPeak(arr, 0, n-1, n);
        System.out.println("index of peak element is  %d:" +m);
    }
}

// Refer GeeksForGeeks https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/