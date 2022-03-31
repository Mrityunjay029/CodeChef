package com.company;

import java.util.Scanner;

public class CodeChef10 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i < t){
            int m = sc.nextInt();
            int h = sc.nextInt();
            h = h * h;
            int bmi = m / h;
            if(bmi <= 18)
                System.out.println("1");
            else if(bmi >18 && bmi < 25)
                System.out.println("2");
            else if(bmi >= 25 && bmi < 30)
                System.out.println("3");
            else
                System.out.println("4");
            i++;
        }
    }
}
