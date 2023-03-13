package interview.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


/*
* 06/03/23
* Company: Diffblue second stage
* Life coding on semi Java code in google doc.
*/
public class InterviewD2 {
    public static void main(String[] args) {

        collectionsTest();
        //Take a look at this code and predict what the printed output will look like:

    }
    private static void collectionsTest() {
        SomeClass o1 = new SomeClass(0);
        SomeClass o2 = new SomeClass(0);
        SomeClass o3 = new SomeClass(1);

        ArrayList<SomeClass> list = new ArrayList<>();
        Collections.addAll(list, o1, o2, o3);
        System.out.println(list); // 001

        HashSet<SomeClass> hashSet = new HashSet<>();
        Collections.addAll(hashSet, o1, o2, o3);
        System.out.println(hashSet); //01

//        TreeSet<SomeClass> treeSet = new TreeSet<>();
//        Collections.addAll(treeSet, o1, o2, o3);
//        System.out.println(treeSet);//01
    }

}
class SomeClass {
    int x;
    public SomeClass(int x) {
        this.x = x;
    }
    public int hashCode() {
        return 0;
    }
    public boolean equals(Object obj) {
        return x == ((SomeClass) obj).x;
    }
    public String toString() {
        return Integer.toString(x);
    }
}


