package com.company;

import java.util.Arrays;

public class Count_pos_neg {
    public static void main(String[] args){
        int arr[] = {-5,0,5,4,6,-4,-6};
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < 0)
                arr[i] = arr[i] * (-1);
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]) {
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}
