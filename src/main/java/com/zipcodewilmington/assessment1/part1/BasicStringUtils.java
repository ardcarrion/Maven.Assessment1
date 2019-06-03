package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        if (str.length() <= 0) return null;
        String firstLetter = String.valueOf(str.charAt(0));
        String temp = firstLetter.toUpperCase();
        if (str.length() == 1) return temp;
        String result = temp + str.substring(1);
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reverse = reverse(str);
        return camelCase(reverse);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        if (str.length() < 2) return null;
        return str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] characters = str.toCharArray();
        String inverted = "";
        for (int i = 0; i < characters.length; i++) {
            String letter = String.valueOf(characters[i]);
            if (characters[i] >= 65 && characters[i] <= 90) {
                inverted += letter.toLowerCase();
            } else if (characters[i] >= 97 && characters[i] <= 122) {
                inverted += letter.toUpperCase();
            } else {
                inverted += letter;
            }
        }

        return inverted;
    }
}
