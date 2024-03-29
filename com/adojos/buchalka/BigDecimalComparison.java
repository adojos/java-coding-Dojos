package com.adojos.buchalka;

import java.math.BigDecimal;

public class BigDecimalComparison {

    public static void main(String[] args) {
        bigDecimalComparison();
    }

    private static void bigDecimalComparison()
    {
        //Method 1
        BigDecimal f1 = new BigDecimal("0.123");
//        BigDecimal pointOne = new BigDecimal("0.1");
//        for (int i = 1; i <= 11; i++) {
//            f1 = f1.add(pointOne);
//        }

        //Method 2
        BigDecimal f2 = new BigDecimal("0.1231");
//        BigDecimal eleven = new BigDecimal("11");
//        f2 = f2.multiply(eleven);

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        if (f1.compareTo(f2) == 0)
            System.out.println("f1 and f2 are equal using BigDecimal\n");
        else
            System.out.println("f1 and f2 are not equal using BigDecimal\n");
    }
}
