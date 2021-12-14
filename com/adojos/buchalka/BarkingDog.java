package com.adojos.buchalka;

public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,8));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        boolean shouldBark = false;

        if (!barking)
        { shouldBark = false;}
        else if ((hourOfDay < 8 && hourOfDay > 0) || (hourOfDay == 0 || hourOfDay == 23))
        {shouldBark =  true;}

        return shouldBark;
    }
}
