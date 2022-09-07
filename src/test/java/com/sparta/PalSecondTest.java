package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalSecondTest {
    @Test
    @DisplayName("Fucntionality test")
    void PalSecondCheck (){
        PalSecond testPalindrome = new PalSecond();
        Assertions.assertTrue(testPalindrome.isPalindrome("racecar"));
        Assertions.assertFalse(testPalindrome.isPalindrome("palindrome"));
    }

    @Test
    @DisplayName("Ignores upper/lower case")
    void PalSecondUpperCheck () {
        PalSecond testPalindrome = new PalSecond();
        Assertions.assertTrue(testPalindrome.isPalindrome("racecar"));
        Assertions.assertTrue(testPalindrome.isPalindrome("RaCEcar"));
    }
}