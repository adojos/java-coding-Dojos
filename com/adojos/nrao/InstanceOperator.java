package com.adojos.nrao;

import java.lang.Boolean;

public class InstanceOperator {

    public static void main (String args[]) {

        Boolean varBool = Boolean.TRUE;
        Integer varInt = Integer.valueOf(10);
        String varString = new String();

        //Boolean result = varBool instanceof Boolean;
        System.out.println(varBool instanceof Boolean);
        System.out.println(varInt instanceof Integer);
        System.out.println(varString instanceof String);



    }
}
