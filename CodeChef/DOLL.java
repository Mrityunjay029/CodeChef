package com.company;

import java.util.Scanner;

public class DOLL {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int count=0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            for(int i=0;i<n;i++){
                if(arr[i] > k)
                    count++;
            }
            System.out.println(count);
        }
    }
}
