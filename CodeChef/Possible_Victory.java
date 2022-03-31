package com.company;

import java.util.Scanner;

public class Possible_Victory {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int o = sc.nextInt();
        int c = sc.nextInt();
        if(36 * (20 - o) > r - c)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
