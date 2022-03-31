package com.company;
import java.util.*;
import java.lang.*;
public class CodeChef4 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i < t){
            int Sa = sc.nextInt();
            int Sb = sc.nextInt();
            int Sc = sc.nextInt();
            if(Sa < Sb && Sa < Sc)
                System.out.println("Draw");
            if(Sb < Sc && Sb < Sa)
                System.out.println("Bob");
            else if(Sc < Sb && Sc < Sa)
                System.out.println("Alice");
            i++;
        }
    }
}
