package com.datastructures.array.sorting;

public class QuickSort {

    void sort(int arr[], int low, int high){

        if(low<high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi + 1, high);
        }
    }

    int partition(int arr[], int low, int high){

        int pivot = arr[high];

        int i = (low-1);

        for(int j=low; j<=high-1; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }

      swap(arr, i+1, high);

        return (i+1);
    }

    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int arr[] = {10, 90, 30, 20, 60, 100, 150, 40};
        int n = arr.length;
        int high = n-1;
        QuickSort obj = new QuickSort();
        obj.sort(arr, 0, high);
        System.out.println("printing the array");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + ",");
        }
    }
}
