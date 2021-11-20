package com.testoxide.dojo.nrao;

public class UnaryDecrementOp {

    public static void main (String args[]) {
        int x = 5;
        System.out.println("Pre-Decrement Operator Example");
        System.out.println("Starting value " + x);
        System.out.println(--x);
        System.out.println(x);

        System.out.println();
        System.out.println("Post-Decrement Operator Example");
        System.out.println("Starting value " + x);
        System.out.println(x--);
        System.out.println(x);

    }
}
