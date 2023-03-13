package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        char[] input = s.toCharArray();
        if (input.length == 0 || input.length == 1) return false;
        char kr1 = '(';
        char kv1 = '[';
        char fg1 = '{';

        char kr2 = ')';
        char kv2 = ']';
        char fg2 = '}';


        Stack<Character> stk = new Stack<>();


        for (int i = 0; i < input.length; i++) {

            if (input[i] == kr1 || input[i] == kv1 || input[i] == fg1) {
                System.out.println("push " + input[i]);

                stk.push(input[i]); stk.()
            } else {
                if (input[i] == kr2 && stk.peek() == kr1) {
                    System.out.println("pop " + input[i]);
                    stk.pop();
                } else if (input[i] == kv2 && stk.peek() == kv1) {
                    System.out.println("pop " + input[i]);
                    stk.pop();
                } else if (input[i] == fg2 && stk.peek() == fg1) {
                    System.out.println("pop " + input[i]);
                    stk.pop();
                } else {
                    System.out.println("false");
                    return false;
                }


            }


        }


        return stk.empty();

    }
}
