package collection;

import java.util.*;

public class ArrayListExample1 {
    public static void main(String[] args) {

        Object[] myArray = new Object[10];
        System.out.println( myArray.length);

        List<String> stringList = new ArrayList<>();

        //myArray.equals();
        System.out.println(myArray.hashCode());


        System.out.println(stringList);

        stringList.add("ZD");
       stringList.set(0, "null");
        //stringList.remove(1.3);//runtime exception

        System.out.println(stringList.size());
        stringList.add("rf");
        stringList.add("yy");
        System.out.println(stringList);
        System.out.println(stringList.size());

        List<String> stringLinkedList = new LinkedList<>();
       // List<int> intArrayList = new ArrayList<>();//compile exception: Type argument cannot be of primitive type
       // List<float> intArrayList = new ArrayList<>();//compile exception: Type argument cannot be of primitive type

        List<int[]> intArraysArrayList = new ArrayList<>();
        intArraysArrayList.add(new int[]{1});
    }
}