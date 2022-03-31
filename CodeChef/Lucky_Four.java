package com.company;

import java.util.Scanner;

public class Lucky_Four {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        int count = 0;
        while(i < t){
            String s = sc.next();
            for(int j = 0;j<s.length();j++){
                if(s.charAt(j) == '4')
                    count++;
            }
            System.out.println(count);
            count = 0;
            i++;
        }
    }
}
