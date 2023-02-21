package leetcode;

import java.math.BigInteger;

public class TestOverflowsInt {

    public static void main(String[] args) {




        int high = 2100000000;
        int low = 2000000000;


        System.out.println( low + high);
        System.out.println("mid using >>> 1 = " + ((low + high) >>> 1)); //Unsigned Right Shift operator
        System.out.println("mid using / 2   = " + ((low + high) / 2));


        BigInteger high1 = new BigInteger( "2100000000");
        BigInteger low1 =new BigInteger(  "2000000000");
        System.out.println( low1.add(high1));



        System.out.println(  (low1.add(high1)).divide(new BigInteger( "2")));


    }

}
