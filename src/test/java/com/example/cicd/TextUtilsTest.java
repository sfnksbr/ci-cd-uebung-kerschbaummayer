package com.example.cicd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

/** Regression tests for the exercise 2 fixes. */
class TextUtilsTest {

    @Test
    void safeParseInt_validNumber_returnsValue() {
        assertEquals(42, TextUtils.safeParseInt("42"));
    }

    @Test
    void safeParseInt_invalidNumber_returnsZero() {
        assertEquals(0, TextUtils.safeParseInt("x"));
    }

    @Test
    void isPalindrome_caseInsensitive_expectedTrue() {
        assertTrue(TextUtils.isPalindrome("Anna"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "a", "abba", "RaceCar", "aNNa"})
    void isPalindrome_recognizesPalindromes(String input) {
        assertTrue(TextUtils.isPalindrome(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "ab", "Anna!"})
    void isPalindrome_rejectsOtherWords(String input) {
        assertFalse(TextUtils.isPalindrome(input));
    }

    @Test
    void isPalindrome_null_returnsFalse() {
        assertFalse(TextUtils.isPalindrome(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "-42", "2147483647", "-2147483648"})
    void safeParseInt_validBoundaries_returnsValue(String input) {
        assertEquals(Integer.parseInt(input), TextUtils.safeParseInt(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", " 42 ", "2147483648", "-2147483649", "4.2"})
    void safeParseInt_invalidOrOverflow_returnsZero(String input) {
        assertEquals(0, TextUtils.safeParseInt(input));
    }

    @Test
    void safeParseInt_null_returnsZero() {
        assertEquals(0, TextUtils.safeParseInt(null));
    }
}
