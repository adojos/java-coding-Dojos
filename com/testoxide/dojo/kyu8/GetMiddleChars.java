package com.testoxide.dojo.kyu8;
/* You are going to be given a word. Your job is to return the middle character of the word.
If the word's length is odd, return the middle character. If the word's length is even,
return the middle 2 characters. */

public class GetMiddleChars {
    public static String getMiddle(String word) {

        char chChar;
        String strChrs = "";

        int iLength = word.length();
        Double firstIndex = (double) (iLength / 2);
        int iIndex = firstIndex.intValue();

        if (!(iLength % 2 == 0)) {
            chChar = word.charAt(iIndex - 1);
            System.out.println("Its an odd set of characters. Middle Char is : " + chChar);
            return (Character.toString(chChar));
        }
        else {
            strChrs = Character.toString(word.charAt(iIndex -1)) + Character.toString(word.charAt(iIndex)) ;
            System.out.println("Its a even set of characters. Middle Chars are : " + strChrs);
            return (strChrs);
        }

    }

    public static void main (String args[]) {
        GetMiddleChars.getMiddle("Tushar");
    }
}
