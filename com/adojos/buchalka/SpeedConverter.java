package com.adojos.buchalka;

public class SpeedConverter {

    public static void main(String[] args) {
        double miles = toMilesPerHour(10.5);
        System.out.println("Miles " + miles);
        printConversion(10.5);
    }

    public static long toMilesPerHour (double kilometersPerHour){

        if (kilometersPerHour <0) {return -1;}
        return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion(double kilometersPerHour){

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour < 0){System.out.println("Invalid Value!");}
        else System.out.println(kilometersPerHour + " km/h" + " = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }

}
