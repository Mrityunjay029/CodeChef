package com.company;
import java.util.*;
import java.lang.*;
public class CodeChef5 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i < t){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(n*k < m)
                System.out.println("YES");
            else
                System.out.println("NO");
            i++;
        }
    }
}