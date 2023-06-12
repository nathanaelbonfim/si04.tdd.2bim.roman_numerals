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
        int[] arabicNumbers = {0, 1, 4, 9, 10, 49, 50, 99, 100, 399, 400, 999, 1000, 2023};
        String[] expectedRomanNumerals = {"", "I", "IV", "IX", "X", "XLIX", "L", "XCIX", "C", "CCCXCIX", "CD", "CMXCIX", "M", "MMXXIII"};

        for (int i = 0; i < arabicNumbers.length; i++) {
            String actualRomanNumeral = RomanNumerals.toRoman(arabicNumbers[i]);
            assertEquals(expectedRomanNumerals[i], actualRomanNumeral);
        }
    }

    @Test
    void testFromRoman() {
        String[] romanNumerals = {"", "I", "IV", "IX", "X", "XLIX", "L", "XCIX", "C", "CCCXCIX", "CD", "CMXCIX", "M", "MMXXIII"};
        int[] expectedArabicNumbers = {0, 1, 4, 9, 10, 49, 50, 99, 100, 399, 400, 999, 1000, 2023};

        for (int i = 0; i < romanNumerals.length; i++) {
            int actualArabicNumber = RomanNumerals.fromRoman(romanNumerals[i]);
            assertEquals(expectedArabicNumbers[i], actualArabicNumber);
        }
    }
}
