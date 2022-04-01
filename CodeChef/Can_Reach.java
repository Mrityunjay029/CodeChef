package com.company;

import java.util.Scanner;

public class Can_Reach {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i < t){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            if(x % k == 0 && y % k == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
            i++;
        }
    }
}
