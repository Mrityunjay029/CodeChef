package com.company;

import java.util.Scanner;

public class Fit_Squares_in_triangle {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        int count = 0;
        int z = 1;
        while(i < t){
            int b =sc.nextInt();
            for(int j=1;j<=b;j++){
                if(j > 3 && j %2 == 0){
                    count = count + z;
                    z++;
                }
            }
            System.out.println(count);
            count = 0;
            z = 1;
            i++;
        }
    }
}
