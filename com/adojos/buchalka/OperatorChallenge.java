package com.adojos.buchalka;

public class OperatorChallenge {

    public static void main(String args[]) {
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;

        double totalDouble = (firstDouble + secondDouble) * 100.00d;
        System.out.println("Total is: " + totalDouble);

        double remainderDouble = totalDouble % 40.00d;
        System.out.println("Remainder is " + remainderDouble);

        boolean isFour;
        if (remainderDouble == 0) {
            isFour = true;
        } else {isFour = false;}
        System.out.println("Remainder is 0? : " + isFour);
    }

}
