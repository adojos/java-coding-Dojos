package com.adojos.kyu8;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        char [] arrVowels = {'a','e','i','o','u'};
        char [] strData = str.toCharArray();
        for (char chData:strData) {
            for (char chVowel:arrVowels) {
                if (chData == chVowel){vowelsCount++;}
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        int iCount = Vowels.getCount("My name is Tushar");
        System.out.println(iCount);
    }
}
