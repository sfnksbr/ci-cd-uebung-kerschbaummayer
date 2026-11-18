package com.example.cicd;

public class TextUtils {

    private TextUtils() {
        // Utility class.
    }

    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    // Invalid, null and out-of-range inputs intentionally use the fallback 0.
    public static int safeParseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
