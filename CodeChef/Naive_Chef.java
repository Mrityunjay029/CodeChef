package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

class Naive_Chef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        double count = 0;
        double count1 = 0;
        while(i < t) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            for(int j=0;j<n;j++){
                if(arr[j] == a)
                    count++;
                if(arr[j] == b)
                    count1++;
            }
            System.out.println((count * count1) / (n*n));
            count = 0;
            count1 = 0;
            i++;
        }
    }
}
