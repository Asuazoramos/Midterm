package string.problems;

public class Palindrome {

    public static void isPalindromeNumber(int num){

        int r=0;
        int sum=0;
        int t;


        t=num;

        while (num > 0){
            r = num%10;
            sum = (sum*10)+r;
            num=num/10;

        }
         if(t==sum){
             System.out.println("palindrome");
         }else{
             System.out.println("not palindrome");

         }









    }

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        isPalindromeNumber(150);
        isPalindromeNumber(152);
        isPalindromeNumber(151);









    }
}
