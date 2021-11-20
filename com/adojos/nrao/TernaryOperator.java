package com.adojos.nrao;

import java.io.*;

public class TernaryOperator {

    public static void main (String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input First Number to compare?");
        int firstNum = Integer.parseInt(br.readLine());
        System.out.println("Input Second Number to compare?");
        int secondNum = Integer.parseInt(br.readLine());

        //Compare Using Ternary Operator
        int result = (firstNum > secondNum) ? firstNum : secondNum;
        System.out.println("Greater Number is " + result);

    }

}
