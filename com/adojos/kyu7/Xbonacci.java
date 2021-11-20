package com.adojos.kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Xbonacci {
    public static double[] tribonacci(double[] s, int n) {

        double dbTemp = 0;
        int indexCount = 0;
        List<Double> arrListOut = new ArrayList<>();

        for (double arrDB: s) {arrListOut.add(arrDB);}

        for (n = n- arrListOut.size(); n != 0; n--, indexCount++) {
            int iIndex = arrListOut.size() - 3;
            for (int iCount = 1; iCount <= 3; iCount++, iIndex++){
                dbTemp += arrListOut.get(iIndex);
                if (iCount == 3){
                    arrListOut.add(dbTemp);
                    dbTemp = 0;
                    iCount = 1;
                    break;
                }
            }
        }
        double [] arrOut = new double[arrListOut.size()];
        for (int i = 0; i < arrListOut.size(); i++){
            arrOut[i] = arrListOut.get(i);
        }
        return arrOut;
    }

public static void main (String args[]) {
    System.out.println(Arrays.toString(tribonacci(new double[]{0,0,1},10)));
}

}

