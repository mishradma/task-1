package com.daya.pearsontask;

import java.util.stream.IntStream;

public final class PalindromesChecker {
    public static boolean checkIfPalindrome(String inputStr){
        String temp  = inputStr.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }
}
