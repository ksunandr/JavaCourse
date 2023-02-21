package leetcode;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {

        char[] inital = s.toCharArray();

        int k = 0;
        for(int i = 0; i < inital.length; i++){


            if (inital[i] == ' ') {
                reverseFromTo(inital, k, i);
                k = ++i;

            }

        }
        reverseFromTo(inital, k, inital.length);
        return new String(inital);

    }
    private void reverseFromTo(char[] arrayChars, int form, int to){
        int j = to-1;
        char c;

        for(int i = form; i < to; i++){


            c = arrayChars[i];
            arrayChars[i] = arrayChars[j];
            arrayChars[j] = c;
            j--;
            if (j<=i) return;




        }




    }
}
