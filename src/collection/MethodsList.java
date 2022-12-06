package collection;

import java.util.Arrays;
import java.util.List;

public class MethodsList {

    public static void main(String[] args) {


        String[] arrayOfString = {"aa", "bb", "cc"};
       List<String> list = Arrays.asList(arrayOfString);

        System.out.println(arrayOfString);
        System.out.println(list);

      //  list.add("22");// runtimeException UnsupportedOperationException
        System.out.println(arrayOfString);
        System.out.println(list);
    }
}
