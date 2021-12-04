package com.datastructures.array;

public class FindMinMaxArray {

    void sort(int arr[], int low, int high){

        if(low<high){
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }

    }

    int partition(int arr[], int low, int high){

        int pivot = arr[high];
        int i = (low -1);

        for (int j = low; j<high-1; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int arr[] = {10, 90, 70, 50, 20, 30};
        int n = arr.length;
        FindMinMaxArray obj = new FindMinMaxArray();
        obj.sort(arr, 0, n-1);
        System.out.println("printing the sorted array");
        for(int i =0; i< n-1; i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
