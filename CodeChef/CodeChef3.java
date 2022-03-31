package com.company;
import java.util.*;
import java.lang.*;
public class CodeChef3 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i<t){
            int x = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            if(m*x >= x+d)
                System.out.println(x+d);
            else
                System.out.println(m*x);
            i++;
        }
    }
}
