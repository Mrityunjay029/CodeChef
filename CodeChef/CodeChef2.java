package com.company;
import java.util.*;
import java.lang.*;
public class CodeChef2 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i < t){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x + (2 * z) >= y)
                System.out.println("YES");
            else
                System.out.println("NO");
            i++;
        }
    }
}
