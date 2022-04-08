package com.company;

public class Finding_Largest_word_in_String {
    public static void main(String[] args){
        String string = "Hardships often prepare ordinary people for an extraordinary destiny";
        string = string + " ";
        String large = " ";
        String word = " ";
        int length = 0;
        String words[] = new String[100];
        for(int i=0;i<string.length();i++){
            if(string.charAt(i) != ' '){
                word = word + string.charAt(i);
            }
            else{
                words[length] = word;
                length++;
                word = "";
            }
        }
        large = words[0];
        for(int i=0;i<length;i++){
            if(large.length() < words[i].length())
                large = words[i];
        }
        System.out.println(large);
    }
}
