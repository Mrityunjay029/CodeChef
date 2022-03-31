package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
public class CodeChef1 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int p = sc.nextInt();
            if(((3 * x) - (n - x)) >= p)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }
        sc.close();
    }
}