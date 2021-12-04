package com.datastructures.array;

import java.util.HashMap;
import java.util.Map;

public class Sort012 {
    void sort(int arr[], int n){

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<n ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        int count0 = map.get(0);
        System.out.println("count0: " + count0);
        int count1 = map.get(1);
        System.out.println("count1: " + count1);
        int count2 = map.get(2);
        System.out.println("count2: " + count2);

        for(int i=0; i<count0; i++){
            arr[i] = 0;
        }

        for(int i = count0; i<(count0+count1); i++){
            arr[i] = 1;
        }

        for(int i = (count0+count1); i<n; i++){
            arr[i] = 2;
        }
    }

    public static void main(String[] args) {

        int arr[] = {0, 1, 2, 0, 1, 1, 1, 2, 0, 0, 0, 2, 2, 2};
        int n = arr.length;

        Sort012 obj = new Sort012();
        obj.sort(arr, n);

        System.out.println("printing the array");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
