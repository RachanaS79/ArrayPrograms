package com.datastructures.array.sorting;

public class SelectionSort {

    public static void selectionSort(int arr[], int n){
        // n = 4
        // 44, 12, 98, 11
        // 0    1   2   3
        /* i    j
        min = 0
        min = 1
           12, 44, 98, 11
           0   1    2  3
                       j
           min = 0
           min = 3 -> 11
           11, 44, 98, 12
         */
        for(int i = 0; i< n -1; i++)
        {
            int minIndex = i;
            for(int j = i +1; j< n ; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Prints the array
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    public static void main(String[] args){

        int arr[] = {44, 12, 98, 11};
        int n = arr.length;
        selectionSort(arr, n);
        printArray(arr);
    }
}
