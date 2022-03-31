package com.company;

import java.util.Scanner;

public class COCONUT {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i < t){
            int xa = sc.nextInt();
            int xb = sc.nextInt();
            int Xa = sc.nextInt();
            int Xb = sc.nextInt();
            System.out.println(Xa / xa + Xb / xb);
            i++;
        }
    }
}
