package kyu7;

import java.util.Arrays;

public class Xbonacci2 {
    public static double[] tribonacci(double[] s, int n) {

        double [] arrOut = Arrays.copyOf(s,n);

        for (int iSize = s.length; iSize <= n-1; iSize++){
            double dbOut = arrOut[iSize-1] + arrOut[iSize-2] + arrOut[iSize-3];
            arrOut[iSize] = dbOut;
        }
        return arrOut;
    }

    public static void main (String args[]) {
        System.out.println(Arrays.toString(Xbonacci2.tribonacci(new double[]{1,1,1},10)));
    }

}
