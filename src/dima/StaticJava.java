package dima;


//import com.sun.tools.javac.util.StringUtils;

import java.util.Collections;
import java.util.List;

public class StaticJava {

    private static final String A = "10";
    private final String B = "10";

    static String s;
    public String p;

    static {
        s = A;

    }

    {
        p = A;

    }



    public static void main(String[] args) {
        method1();
        String a = new String();
        String b;
        a.length();

        UtilsExample.isRed("1");
    }

    public static void method1() {


    }
    public void method2() {
       method1();

    }




}

final class UtilsExample{

    private UtilsExample(){
       // StringUtils.toUpperCase("u");
        List<String> u = Collections.EMPTY_LIST ;
        "u".toUpperCase();


    }

    public static boolean isRed(String s){

        System.out.println(java.lang.Math.pow(-2, 2));
        return true;
    }
}