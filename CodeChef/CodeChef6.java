package com.company;

import java.util.Scanner;

public class CodeChef6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1.equals("R") || s2.equals("R"))
            System.out.println("R");
        else if(s1.equals("B") || s2.equals("B"))
            System.out.println("B");
        else
            System.out.println("G");
    }
}
