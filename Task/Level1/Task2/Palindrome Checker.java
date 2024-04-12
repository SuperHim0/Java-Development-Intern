package Internship;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        Boolean isChecker = isPalindrome(str);
        if (isChecker)
            System.out.println("the given string is palindrome ");
        else
            System.out.println("the given string is not palindrome");
    }
    public static Boolean isPalindrome (String str){
        String removePun =  str.replaceAll("\\p{Punct}","").toLowerCase();
        String removeSpace = removePun.replaceAll(" " , "");
        System.out.println(removeSpace);
        int right = (removeSpace.length()-1);
        int left = 0;
        while (left < right){
            char leftChar= removeSpace.charAt(left);
            char rightChar= removeSpace.charAt(right);
            System.out.println(leftChar+" :: "+rightChar);
            if (leftChar == rightChar){
                left++;
                right--;
            }else if (leftChar != rightChar){
                return false;
            }
        }
        return true;
    }
}
/* Description: Implement a program that checks
whether a given word or phrase is a palindrome. A
palindrome is a word or phrase that reads the
same forwards and backward, ignoring spaces and
punctuation.

Skills: String manipulation, loops, conditional
statements.

*/
