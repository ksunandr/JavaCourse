package dima;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class AlgorithmIntro {


    public static void main(String[] args) {
        int[] array = new int[1]; //array has predefined size and can't change it
        int[] array1 = new int[]{1,2,3};
        ArrayList arrayList = new ArrayList();// wrapper for array
        LinkedList linkedList = new LinkedList(); // not a wrapper for array

      //  linkedList.add(10); //trys to find the element checking maximum half of the elements one by one with complexity f(n)
        //arrayList.get(1000); //take the element by index with complexity f(1)
       // linkedList.get(1000);

        for (int i = 0; i< 1_000_000; i++) {
            arrayList.add(i);
            arrayList.add(5, i);

        }
        ArrayList arrayList1 = new ArrayList(1_000_000_000);//if u want to not use autoextension of ArrayList
        HashSet a = new HashSet();
        a.add(10);

//        for (int i = 0; i< 1_000_000; i++) {
//            linkedList.add(i);
//
//        }

    }

}
