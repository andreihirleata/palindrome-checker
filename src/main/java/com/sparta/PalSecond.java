package com.sparta;

public class PalSecond implements PalInterface{
    @Override
    public boolean isPalindrome(String s) {
        String noSpaces = s.toLowerCase();
        StringBuilder reverseNoSpaces = new StringBuilder(noSpaces);

        return reverseNoSpaces.reverse().toString().equals(noSpaces);
    }
}
