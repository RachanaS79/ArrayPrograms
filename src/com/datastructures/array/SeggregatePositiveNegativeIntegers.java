package com.datastructures.array;

public class SeggregatePositiveNegativeIntegers {

    void seggregate(int arr[], int low, int n){
        int left = low;
        int right = n-1;

        while(left<right){

            if(arr[left]<0)
                left++;
            else if(arr[right]>0)
                right--;
            else
              swap(arr, left, right);
        }
    }

    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int arr[] = {-10, 9, -17, 6, 7, -15, 19, 0, 5};
        int n = arr.length;
        SeggregatePositiveNegativeIntegers obj = new SeggregatePositiveNegativeIntegers();
        obj.seggregate(arr, 0, n-1);
        System.out.println("printing the sorted array");
        for(int i =0; i< n-1; i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
