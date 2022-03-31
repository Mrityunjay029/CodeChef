package com.company;

import java.util.Scanner;

public class Save_Water_Save_Life {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i < t){
            int h = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = sc.nextInt();
            if(h*(x + y / 2) <= c)
                System.out.println("Yes");
            else
                System.out.println("No");
            i++;
        }
    }
}
}
