package com.daya.pearsontask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PalindromesCheckerTest {

    @Test
    void checkIfPalindromeWhenSuccess() {
        Assertions.assertTrue(PalindromesChecker.checkIfPalindrome("NooN"));
    }
    @Test
    void checkIfPalindromeWhenFailedBecauseOfCamelCase() {
        Assertions.assertTrue(PalindromesChecker.checkIfPalindrome("Noon"));
    }
    @Test
    void checkIfPalindromeWhenNotMatched() {
        Assertions.assertFalse(PalindromesChecker.checkIfPalindrome("Noon1"));
    }
    @Test
    void checkIfPalindromeWhenMatchedWithTrim() {
        Assertions.assertTrue(PalindromesChecker.checkIfPalindrome("No on   "));
    }
}