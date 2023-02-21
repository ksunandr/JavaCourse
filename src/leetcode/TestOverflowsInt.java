package leetcode;

import java.lang.annotation.Native;
import java.math.BigInteger;

public class TestOverflowsInt {

    public static void main(String[] args) {

        int high = 2100000000;
        int low = 2000000000;
        //int max 2147483647
        // 2_147_483_647
        //MAX_VALUE is a number in the Java Integer сlass of java. lang package.
        // It is the maximum possible Integer number that can be represented in 32 bits.
        // Its exact value is 2147483647 i.e. 2^31-1.
        /**
         * A constant holding the maximum value an {@code int} can have, 2^31 -1.
         */
       // @Native public static final int   MAX_VALUE = 0x7fffffff;





        System.out.println( low + high);
        System.out.println("mid using >>> 1 = " + ((low + high) >>> 1)); //Unsigned Right Shift operator
        System.out.println("mid using / 2   = " + ((low + high) / 2));


        BigInteger high1 = new BigInteger( "2100000000");
        BigInteger low1 =new BigInteger(  "2000000000");
        System.out.println( low1.add(high1));



        System.out.println(  (low1.add(high1)).divide(new BigInteger( "2")));


    }

}
