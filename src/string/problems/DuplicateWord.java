package string.problems;

import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    private static final Object String = "";

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Integer count;

        //String words[] = String.Split(" ");
        st.toLowerCase();
        int Count;
        int letterCount = 0;
        int numberOfWords;
        String[] words = st.split(" ");
        System.out.println(words.length);
        for (String word : words) {
            letterCount += word.length();

            ;
        }
        System.out.println(letterCount / words.length);
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; i++)
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            if (count > 1 && words[i] != "0")
                System.out.println(words[i] + " " + count);

        }
        System.out.println(st);
    }
}





