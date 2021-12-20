package com.adojos.buchalka;

public class DecimalComparator {

    public static void main(String[] args)
    {
        // Get the two double values
        // to be compared
        Double d1 = 1023.365;
        Double d2 = 1023.3656;

        // function call to compare two double values
        if (Double.compare(d1, d2) == 0) {

            System.out.println("d1=d2");
        }
        else if (Double.compare(d1, d2) < 0) {

            System.out.println("d1<d2");
        }
        else {

            System.out.println("d1>d2");
        }

    }


//    public static boolean areEqualByThreeDecimalPlaces(double dFirst, double dSecond){
//
//    }




}
