package com.company;

public class Anagrams {
    public static void main(String[] args){
        String str1 = "vedan@sh";
        String str2 = "vedan@sh";
        int arr[] = new int[26];
        int arr1[] = new int[26];
        int index = 0;
        int count = 0;
        String s = "abcdefghijklmnopqrstuvwxyz";
        if(str1.length() ==str2.length()){
            for(int i=0;i<str1.length();i++){
                char ch = str1.charAt(i);
                index = s.indexOf(ch);
                if(index == -1)
                    break;
                arr[index]++;
                ch = str2.charAt(i);
                index = s.indexOf(ch);
                if(index == -1)
                    break;
                arr1[index]++;
            }
            if(index != -1) {
                for (int i = 0; i < 26; i++) {
                    count++;
                    if (arr[i] != arr1[i]) {
                        System.out.println("Not anagrams");
                        break;
                    }
                }
            }
            else
                System.out.println("Not anagrams");
            if(count == 26){
                System.out.println("Anagrams");
            }
        }
        else
            System.out.println("Not Anagrams");
    }
}
