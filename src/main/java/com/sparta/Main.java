package com.sparta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        PalindromeCheck palCheck = new PalindromeCheck();
        System.out.println("Please type sentence to check for palindromes: ");
        String sentence = sc.nextLine();
        System.out.println("Choose which algorithm to use to determine palindrome: ");
        System.out.println("1. Iterating through the letters using a for loop");
        System.out.println("2. Reversing the string and comparing it to the original");
        System.out.println("3. Comparing start letter with end letter and iterating towards middle");
        int option = sc.nextInt();
        System.out.println("Palindromes found: " + palCheck.containsPalindromes(sentence, option));
    }
}