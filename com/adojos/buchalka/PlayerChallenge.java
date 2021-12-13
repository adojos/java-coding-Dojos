
package com.adojos.buchalka;

public class PlayerChallenge {

    public static void main(String[] args) {

        int intGetHighScore;
        intGetHighScore = calculateHighScorePos(1500);
        displayHighScore("Tim",intGetHighScore);

        intGetHighScore = calculateHighScorePos(900);
        displayHighScore("John",intGetHighScore);

        intGetHighScore = calculateHighScorePos(400);
        displayHighScore("Ruby",intGetHighScore);

    }

    public static void displayHighScore(String strName, int intPos){

        System.out.println(strName + " managed to get into position " + intPos + " on the Score Table");
    }

    public static int calculateHighScorePos (int intScore){

        int intPosition = 0;
        if (intScore>1000){intPosition = 1;}
        else if (intScore>500 && intScore<1000){intPosition = 2;}
        else if (intScore>100 && intScore<500){intPosition = 3;}
        else if (intScore>100 && intScore<500){intPosition = 4;}
        return intPosition;
    }


}
