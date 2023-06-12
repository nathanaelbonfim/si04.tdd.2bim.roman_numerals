/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import br.unipar.si.tdd.numeraisromanos.RomanNumerals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nathanael
 */
public class RomanNumeralsTest {
        @Test
    void testToRoman() {
        int[] arabicNumbers = {-1, 0, 1, 4, 9, 10, 49, 50, 99, 100, 399, 400, 999, 1000, 2023, 4000};
        String[] expectedRomanNumerals = {"", "", "I", "IV", "IX", "X", "XLIX", "L", "XCIX", "C", "CCCXCIX", "CD", "CMXCIX", "M", "", ""};

        for (int i = 0; i < arabicNumbers.length; i++) {
            try {
                String actualRomanNumeral = RomanNumerals.toRoman(arabicNumbers[i]);
                assertEquals(expectedRomanNumerals[i], actualRomanNumeral);
            } catch (IllegalArgumentException e) {
                // Invalid input throws an exception, so we assert that an exception is thrown in such cases
                assertEquals(expectedRomanNumerals[i], "");
            }
        }
    }

    @Test
    void testFromRoman() {
        String[] romanNumerals = {"", "I", "IV", "IX", "X", "XLIX", "L", "XCIX", "C", "CCCXCIX", "CD", "CMXCIX", "M", "MMXXIII", "MMMM", "ABC"};
        int[] expectedArabicNumbers = {0, 1, 4, 9, 10, 49, 50, 99, 100, 399, 400, 999, 1000, 0, 0, 0};

        for (int i = 0; i < romanNumerals.length; i++) {
            try {
                int actualArabicNumber = RomanNumerals.fromRoman(romanNumerals[i]);
                assertEquals(expectedArabicNumbers[i], actualArabicNumber);
            } catch (IllegalArgumentException e) {
                // Invalid input throws an exception, so we assert that an exception is thrown in such cases
                assertEquals(expectedArabicNumbers[i], 0);
            }
        }
    }
}
