package com.daya.pearsontask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanConverterTest {

    @Test
    void convertToRoman() {
        String actual = IntegerToRomanConverter.convertToRoman(39);
        Assertions.assertEquals("XXXIX",actual);
    }
    @Test
    @DisplayName("Check For 246")
    void convertToRoman2() {
        String actual = IntegerToRomanConverter.convertToRoman(246);
        Assertions.assertEquals("CCXLVI",actual);
    }
    @Test
    @DisplayName("Check For 789")
    void convertToRoman3() {
        String actual = IntegerToRomanConverter.convertToRoman(789);
        Assertions.assertEquals("DCCLXXXIX",actual);
    }
    @Test
    @DisplayName("Check For 2421")
    void convertToRoman2421() {
        String actual = IntegerToRomanConverter.convertToRoman(2421);
        Assertions.assertEquals("MMCDXXI",actual);
    }

}