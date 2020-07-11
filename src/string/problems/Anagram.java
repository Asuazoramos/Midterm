package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String str1 = "cat";
        String str2 = "tac";
        System.out.println("both string are anagrams" + anagramCheck(str1, str2));
    }
      public static boolean anagramCheck(String str1,String str2){
        char[] charArrayfromString1=str1.toCharArray();
        char[] charArrayfromString2=str2.toCharArray();
        Arrays.sort(charArrayfromString1);
        Arrays.sort(charArrayfromString2);
        return Arrays.equals(charArrayfromString1, charArrayfromString2);







    }
}
