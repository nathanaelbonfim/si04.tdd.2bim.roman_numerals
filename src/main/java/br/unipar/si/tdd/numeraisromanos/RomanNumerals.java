/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.unipar.si.tdd.numeraisromanos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nathanael
 */
public class RomanNumerals {

    private static final String[] ROMAN_NUMERALS = {
        "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    private static final int[] ARABIC_VALUES = {
        1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };

    private static final int MAX_LIMIT = 1001;

    public static String toRoman(int arabicNumber) {
        if (arabicNumber < 1 || arabicNumber > MAX_LIMIT) {
            throw new IllegalArgumentException("Input is outside the allowed boundaries.");
        }

        StringBuilder romanNumber = new StringBuilder();

        for (int i = 0; i < ARABIC_VALUES.length; i++) {
            while (arabicNumber >= ARABIC_VALUES[i]) {
                romanNumber.append(ROMAN_NUMERALS[i]);
                arabicNumber -= ARABIC_VALUES[i];
            }
        }

        return romanNumber.toString();
    }

    public static int fromRoman(String romanNumber) {
        if (romanNumber.length() > 15 || !isValidRomanNumeral(romanNumber)) {
            throw new IllegalArgumentException("Input is outside the allowed boundaries or not supported.");
        }

        int arabicNumber = 0;
        int previousValue = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            char currentSymbol = romanNumber.charAt(i);
            int currentValue = getRomanValue(currentSymbol);

            if (currentValue >= previousValue) {
                arabicNumber += currentValue;
            } else {
                arabicNumber -= currentValue;
            }

            previousValue = currentValue;
        }

        if (arabicNumber > MAX_LIMIT) {
            throw new IllegalArgumentException("Input is outside the allowed boundaries or not supported.");
        }

        return arabicNumber;
    }

    private static int getRomanValue(char symbol) {
        switch (symbol) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral: " + symbol);
        }
    }

    private static boolean isValidRomanNumeral(String romanNumber) {
        Set<Character> validSymbols = new HashSet<>(Arrays.asList('I', 'V', 'X', 'L', 'C', 'D', 'M'));

        // Check for invalid characters
        for (char symbol : romanNumber.toCharArray()) {
            if (!validSymbols.contains(symbol)) {
                return false; // Invalid character found
            }
        }

        return true; // The Roman numeral is valid
    }
}
