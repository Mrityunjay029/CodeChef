package com.company;

import java.util.Scanner;

public class Tyres {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i < t){
            int N = sc.nextInt();
            if(N%4 >=2 && N %4 <=3)
                System.out.println("Yes");
            else
                System.out.println("No");
            i++;
        }
    }
}
