package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;

class PalindromeCheckTest {
    @Test
    @DisplayName("Functionality test")
    void palindromeCheckTest() {
        PalindromeCheck palCheckTest = new PalindromeCheck();
        String testString = "racecar car civic";
        List<String> expected = asList("racecar","civic");
        Assertions.assertLinesMatch(expected,palCheckTest.containsPalindromes(testString,1));
        Assertions.assertLinesMatch(expected,palCheckTest.containsPalindromes(testString,2));
        Assertions.assertLinesMatch(expected,palCheckTest.containsPalindromes(testString,3));
    }

    @Test
    @DisplayName("Ignores special characters")
    void palindromeSpecialCharTest () {
        PalindromeCheck palCheckTest = new PalindromeCheck();
        List<String> expected = asList("racecar","civic");
        String testString = "race!car car ci.vi,c";
        Assertions.assertLinesMatch(expected,palCheckTest.containsPalindromes(testString,1));
        Assertions.assertLinesMatch(expected,palCheckTest.containsPalindromes(testString,2));
        Assertions.assertLinesMatch(expected,palCheckTest.containsPalindromes(testString,3));
    }
}