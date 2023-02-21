package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class LambdaTest {

    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
       TreeMap<String, String> treeMap1 = new TreeMap<>((String s, String s1) ->
       {
           if(s.equals("1")) return 1;
           return 0;
       }

       );
        TreeMap<String, String> treeMap2 = new TreeMap<>((o1, o2) -> 0);

        ArrayList<Student> students =
                new ArrayList<>();

        Collections.sort(students, (s1, s2) -> s1.cource + s2.cource);
        Collections.sort(students, (s1, s2) -> s1.cource - s2.cource); // ->>>
        Collections.sort(students, Comparator.comparingInt(s -> s.cource));


    }

}
