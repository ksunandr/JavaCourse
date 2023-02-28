package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeTest {


    public static void main(String[] args) {
        System.out.println();



        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(1, 3);
        treeMap.put(3, 4);
        treeMap.put(4, 17);
        treeMap.put(5, 1);
        treeMap.put(17, 7);
        treeMap.put(7, 5);

        System.out.println("keys");

        for (Map.Entry<Integer,Integer> entry: treeMap.entrySet()) {
            System.out.println(entry.getKey());

        }
        System.out.println("values");

        for (Map.Entry<Integer,Integer> entry: treeMap.entrySet()) {
            System.out.println( entry.getValue());

        }}
}





