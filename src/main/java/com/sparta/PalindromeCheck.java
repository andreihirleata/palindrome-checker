package com.sparta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeCheck {
    List<String> containsPalindromes(String s, int option) {
        List<String> splitWords = Arrays.asList(s.split(" "));
        List<String> palindromesFound = new ArrayList<String>();

        for(String word : splitWords){
           String noSpecialCharacters = word.replaceAll("[^\\da-zA-Z]","");

           if(option == 1) {
               PalFirst palCheck = new PalFirst();
               if (palCheck.isPalindrome(noSpecialCharacters)) {
                   palindromesFound.add(noSpecialCharacters);
               }
           }
            if(option == 2) {
                PalSecond palCheck = new PalSecond();
                if (palCheck.isPalindrome(noSpecialCharacters)) {
                    palindromesFound.add(noSpecialCharacters);
                }
            }
            if(option == 3) {
                PalThird palCheck = new PalThird();
                if (palCheck.isPalindrome(noSpecialCharacters)) {
                    palindromesFound.add(noSpecialCharacters);
                }
                }
            }
            return palindromesFound;
        }
    }
