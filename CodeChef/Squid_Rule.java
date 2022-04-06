package com.company;

import java.util.Scanner;

public class Squid_Rule {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int min = 999999999;
            int index = 0;
            int sum = 0;
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            for(int i=0;i<n;i++){
                if(min > arr[i])
                    min = arr[i];
                index = i;
            }
            for(int i=0;i<n;i++){
                if(i != index)
                    sum = sum + arr[i];
            }
            System.out.println(sum);

        }
    }
}
