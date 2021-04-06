package com.company;

public class palindrome {

    public static void main(String[] args) {
        System.out.println("the give text is " + isPalindrome("mom"));

    }

    public static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);


    }

    private static boolean isPalindrome(String str, int low, int high) {
        if (high <= low) {
            return true;
        } else if (str.charAt(low) != str.charAt(high)) {
            return false;
        } else {
            return isPalindrome(str, low + 1, high - 1);
        }

    }
}

