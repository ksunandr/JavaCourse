package collection;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
       TreeMap<String, String> treeMap =  new TreeMap<>();
        //treeMap.put(null, "1" );
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(null, "1");

      String o =   hashMap.get("9");

        System.out.println(o);


        for (Map.Entry<String, String> entry: hashMap.entrySet()) {

        }

    }
}
