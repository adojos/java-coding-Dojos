/*Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"*/

package com.testoxide.dojo.kyu7;

public class ReversingWords {

    public static String reverseWords(final String original) {

        StringBuilder tempSB = new StringBuilder();
        StringBuilder finalSB = new StringBuilder();
        char[] arrChar = original.toCharArray();

        for (char tmpChar : arrChar) {
            if (!Character.isSpaceChar(tmpChar)) {
                tempSB.append(tmpChar);
            } else {
                if (tempSB.length() != 0) {
                    finalSB.append(tempSB.reverse());
                    tempSB.delete(0, tempSB.length());
                    finalSB.append(tmpChar);
                } else {
                    finalSB.append(tmpChar);
                }
            }

        }
        if (!tempSB.toString().isEmpty()){finalSB.append(tempSB.reverse());}
        return finalSB.toString();
    }

    public static void main(String args[]) {
        System.out.println(ReversingWords.reverseWords("This is an example"));
    }

}
