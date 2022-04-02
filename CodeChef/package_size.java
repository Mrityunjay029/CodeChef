package com.company;

import java.util.Scanner;

public class package_size {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i < t){
            int remainder = -1;
            int packagesize = 0;
            int n = sc.nextInt();
            for(int j = 1;j<=n;j++){
                if(remainder <= n % j){
                    remainder = n % j;
                    packagesize = j;
                }
            }
            System.out.println(packagesize);
            i++;
        }
    }
}
