package com.adojos.buchalka;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1600));
    }

    public static boolean isLeapYear(int year){

        boolean isValidYear = (year >=1 && year <= 9999) ? true : false;
        boolean isLeap = false;

        if (isValidYear) {
            if (year % 4 == 0){
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        isLeap = true;
                    } else {
                        isLeap = false;
                    }
                } else {
                    isLeap = true;
                }
            }
            else {
                isLeap = false;
            }
        } else {
            isLeap = false;
        }

        return isLeap;

    }

}
