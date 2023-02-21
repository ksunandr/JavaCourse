package leetcode;

public class ReverseString {
    public void reverseString(char[] s) {
        char c;
        int j = 0;

        for(int i = s.length-1; i>=0; i--){


            c = s[i];
            s[i] = s[j];
            s[j] = c;
            j++;

            if (i<=j) return;

        }

    }
}
