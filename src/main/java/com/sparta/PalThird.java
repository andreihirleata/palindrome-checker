package com.sparta;

public class PalThird implements PalInterface{

    @Override
    public boolean isPalindrome(String s) {
        String noSpaces = s.toLowerCase();
        int stringStart = 0;
        int stringEnd = noSpaces.length() - 1;

        while(stringStart < stringEnd) {
            if(noSpaces.charAt(stringStart) != noSpaces.charAt(stringEnd)) {
                return false;
            }
            stringStart +=1;
            stringEnd -= 1;
        }
        return true;
    }
}
