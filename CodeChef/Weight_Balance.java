package com.company;

import java.util.Scanner;

public class Weight_Balance {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int hcf = 0;
        int z = 1;
        int n = sc.nextInt();
        int arr[] = new int[n];
       for(int i =0;i<n;i++)
           arr[i] = sc.nextInt();
       for(int i =0;i<n;){
           if(arr[i] % z == 0){
               hcf = z;
               i++;
               z++;
           }
           else
               z++;
       }
        System.out.println(hcf);
}
}
