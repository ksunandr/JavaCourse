package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        String s = "ma1am";
        List<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        System.out.println(list);


        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean isPalindrome = true;
        int i = 0;
        double middle = list.size() / 2;

        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
//             System.out.println(iterator.nextIndex());
//             System.out.println(reverseIterator.previousIndex());

//             System.out.println(middle);
            if (iterator.nextIndex() > middle)
                break;

            i++;
            if (iterator.next() != reverseIterator.previous()) {


                isPalindrome = false;
                break;
            }


        }
        System.out.println(i);
        System.out.println("isPalindrome " + isPalindrome);


    }

}
