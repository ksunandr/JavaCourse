package interview;

/*
* 17/02/2023
* Company: Fluro
* Interview Java Software engineer 30 min
* Common questions about my personality and experience + one task
* Company: Fluro
* :(
 */


import java.util.ArrayList;
import java.util.Collections;

public class InterviewF {

    private static final String INPUT = "fluro";
    public static void main(String[] args) {

        System.out.println(byStringBuilder(INPUT));
    }


    public static String byStringBuilder(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static String byList(String input) {
        char[] chars = input.toCharArray();
        ArrayList<Character> characterArrayList = new ArrayList<>();
        for (char c : chars) {
            characterArrayList.add(c);


        }
        Collections.reverse(characterArrayList);

        StringBuilder result = new StringBuilder();
        for (Character c : characterArrayList) {
            result.append(c);

        }

        return result.toString();
    }

    public static String myMethod(String input) {
        char[] chars = input.toCharArray();
        char[] charsOtherDirection = new char[chars.length];

        int j = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            charsOtherDirection[j] = chars[i];
            j++;
        }

        return new String(charsOtherDirection);
    }

}



