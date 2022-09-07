package com.sparta;

public class PalFirst implements PalInterface{

    @Override
    public boolean isPalindrome(String s) {
            // add null check and empty string input
            String noSpaces = s.toLowerCase();
            int length = noSpaces.length();

            for (int i = 0; i < length / 2; i++) {
                if (noSpaces.charAt(i) != noSpaces.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
    }
}
