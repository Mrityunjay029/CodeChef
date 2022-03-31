package com.company;

import java.util.Scanner;

public class CodeChef7 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        int sunny = 0;
        int rainy = 0;
        while(i < t){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            int a4 = sc.nextInt();
            int a5 = sc.nextInt();
            int a6 = sc.nextInt();
            int a7 = sc.nextInt();
            if(a1+a2+a3+a4+a5+a6+a7 >= 4)
                System.out.println("YES");
            else
                System.out.println("NO");
            i++;
        }
    }
}
