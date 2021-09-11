package com.datastructures.array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNumberInArray {

    static void frquencyNumber(int arr[], int n){

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<n ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println("keys: "+entry.getKey() +"values: " +entry.getValue());
        }

    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 10};
        int n = arr.length;
        frquencyNumber(arr, n);
    }
}
