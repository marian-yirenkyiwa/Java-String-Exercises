package day3labs;

import java.util.Locale;
import java.util.SortedMap;
import java.util.TreeMap;

public class Palindrome {

    public static boolean isPalindrome(String word){

        word =  word.replaceAll(" ", "").toLowerCase();

        for(int i = 0; i < Math.floorDiv(word.length(),2); i++) {
            if(word.charAt(i) != word.charAt(word.length()-(i+1))) {
                return false;
            }
        }

        return true;
    }
}
