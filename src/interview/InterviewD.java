package interview;

import java.util.Map;
import java.util.TreeMap;

/*
* 23/02/23
* Company: Diffblue
* Interview Senior Java Software engineer 30 min
* Common questions about my experience
* What makes you unique?
* Questions about OOP
* What the difference between abstract class and interface?
* Life coding on semi Java code in google doc. One long task about Tree.
* Implement findMaximumValue in the not ordered tree. Recursion?
* One more method (don't remember, because I didn't start do it)
* Unit test for findMaximumValue
*/
public class InterviewD {

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

        }

    }




}
