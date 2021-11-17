package com.datastructures.array.sorting;

public class MergeSort {

    public static void merge(int arr[], int l, int m, int r){

        int i = l;
        int j = m+1;
        int k = l;

        int[] temp = new int[10];

        while(i<=m && j<=r){
            if(arr[i]<arr[j])
            {
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }

        while(i<=m){
            temp[k++] = arr[i++];
        }
        while(j<=r){
            temp[k++] = arr[j++];
        }

        for(i = 0; i<r; i++){
            arr[i] = temp[i];
        }

    }

   public static void mergeSort(int arr[], int l,  int r){
       if(l<r) {

           int m = (r-1)/2;

           mergeSort(arr, l, m);
           mergeSort(arr, m + 1, r);

           merge(arr, l, m, r);
       }
    }

    public static void main(String[] args){
        int arr[] = {10,80, 60, 40, 90, 12};
        int r = arr.length;
        int l = 0;
        int m = (r-1)/2;
        System.out.println("m " +m);
        System.out.println("r " +r);

        mergeSort(arr, l , r);

//        System.out.println("printing the array");
//        for(int i = 0; i<r ; i++){
//            System.out.println(arr[i] + ",");
//        }
    }
}
