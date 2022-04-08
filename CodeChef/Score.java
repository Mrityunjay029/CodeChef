package com.company;

import java.util.Scanner;

public class Score {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[8];
            int sum = 0;
            while(n-- > 0) {
                int ques = sc.nextInt()-1;
                int score = sc.nextInt();
                if(ques < 8 && arr[ques] < score)
                    arr[ques] = score;
            }
            for(int i = 0; i < 8; i++)
                sum += arr[i];
            System.out.println(sum);
        }
    }
}
