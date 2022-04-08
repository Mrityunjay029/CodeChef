package com.company;

import java.util.Scanner;

public class Devu_And_Friends {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int count = 1;
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();

            for(int i=0;i<(n-1);i++){
                for(int j=(i+1);j<n;j++){
                    if(arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for(int i=0;i<(n-1);i++){
                for(int j=(i+1);j<n;j++){
                    if(arr[i] != arr[j]){
                        count++;
                        i = j-1;
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
