package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;

import static com.zipcodewilmington.assessment1.part1.BasicStringUtils.reverse;

public class Palindrome {

    public Integer countPalindromes(String input){
        ArrayList<String> palindromes = new ArrayList<String>();
        String[] substrings = allSubstrings(input);
        for (String sub : substrings) {
            String reversed = reverse(sub);
            if (reversed.equals(sub)) palindromes.add(sub);
        }
        return palindromes.size();
    }

    public String[] allSubstrings(String input) {
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length(); j++) {
                String sub = input.substring(i, j);
                substrings.add(sub);
            }
        }
        String[] result = new String[substrings.size()];
        return substrings.toArray(result);
    }
}
