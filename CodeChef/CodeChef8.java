package com.company;

import java.util.Scanner;

public class CodeChef8 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i < t){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A>0 && B>0)
                System.out.println("Solution");
            else if(B==0)
                System.out.println("Solid");
            else if(A==0)
                System.out.println("Liquid");
            i++;
        }
    }
}
