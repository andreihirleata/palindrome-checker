package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalFirstTest {
    @Test
    @DisplayName("Fucntionality test")
    void palFirstCheck (){
        PalFirst testPalindrome = new PalFirst();
        Assertions.assertTrue(testPalindrome.isPalindrome("racecar"));
        Assertions.assertFalse(testPalindrome.isPalindrome("palindrome"));
    }

    @Test
    @DisplayName("Ignores upper/lower case")
    void palFirstUpperCheck () {
        PalFirst testPalindrome = new PalFirst();
        Assertions.assertTrue(testPalindrome.isPalindrome("racecar"));
        Assertions.assertTrue(testPalindrome.isPalindrome("RaCeCAR"));
    }
}