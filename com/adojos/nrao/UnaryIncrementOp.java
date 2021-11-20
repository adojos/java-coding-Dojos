package com.adojos.nrao;

public class UnaryIncrementOp {

    public static void main (String args[]) {
        int x = 1;
        System.out.println("Pre-Increment Operator Example");
        System.out.println("Starting value " + x);
        System.out.println(++x);
        System.out.println(x);

        System.out.println();
        System.out.println("Post-Increment Operator Example");
        System.out.println("Starting value " + x);
        System.out.println(x++);
        System.out.println(x);

    }
}
