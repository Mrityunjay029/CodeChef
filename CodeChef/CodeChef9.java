package com.company;

import java.util.Scanner;

public class CodeChef9 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i < t){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a + b < 3)
                System.out.println("1");
            else if(a + b >= 3 && a + b <= 10)
                System.out.println("2");
            else if(a + b >= 11 && a + b <=60)
                System.out.println("3");
            else if(a + b > 60)
                System.out.println("4");
            i++;
        }
    }
}
