## UI: Roman Numeral Converter

This Java code provides a command-line interface (CLI) for interacting with the Roman numeral converter. The `Main` class contains the `main` method, which acts as the entry point for the program. It presents a menu to the user, allowing them to convert between Arabic numbers and Roman numerals.

## Usage

To run the program, compile and execute the `Main` class. The program will prompt the user for input and display the corresponding conversion result.

```
$ javac Main.java
$ java Main
```

### Menu Options

The program presents the following menu options to the user:

1. **Convert from Arabic to Roman**: Converts an Arabic number to a Roman numeral.
2. **Convert from Roman to Arabic**: Converts a Roman numeral to an Arabic number.
3. **Exit**: Terminates the program.

The user can enter the option number to perform the desired conversion or exit the program.

### Converting from Arabic to Roman

To convert an Arabic number to a Roman numeral, select option 1 from the menu. Enter the Arabic number when prompted, and the program will display the corresponding Roman numeral.

Example:
```
Select an option: 1
Enter an Arabic number: 42
Roman numeral: XLII
Convert another number? (Y/N): Y
```

### Converting from Roman to Arabic

To convert a Roman numeral to an Arabic number, select option 2 from the menu. Enter the Roman numeral when prompted (in uppercase), and the program will display the corresponding Arabic number.

Example:
```
Select an option: 2
Enter a Roman numeral: MCMXCIX
Arabic number: 1999
Convert another number? (Y/N): N
Goodbye!
```

# Class

The class provides simple implementation for converting between Roman numerals and Arabic numbers. The `RomanNumerals` class contains two static methods: `toRoman` and `fromRoman`, which convert an Arabic number to a Roman numeral and vice versa, respectively.

## Usage

### Converting Arabic Numbers to Roman Numerals

To convert an Arabic number to a Roman numeral, use the `toRoman` method:

```java
int arabicNumber = 42;
String romanNumeral = RomanNumerals.toRoman(arabicNumber);
System.out.println(romanNumeral); // Output: "XLII"
```

### Converting Roman Numerals to Arabic Numbers

To convert a Roman numeral to an Arabic number, use the `fromRoman` method:

```java
String romanNumeral = "X";
int arabicNumber = RomanNumerals.fromRoman(romanNumeral);
System.out.println(arabicNumber); // Output: 10
```

## Allowed Boundaries

The code supports conversion within the range of 1 to 1001 (inclusive) for both Arabic numbers and Roman numerals. If the input value falls outside this range, an `IllegalArgumentException` will be thrown.

## Limitations

- The maximum length of a Roman numeral string for conversion is limited to 15 characters.
- The code only supports uppercase Roman numerals ('I', 'V', 'X', 'L', 'C', 'D', 'M'). Any other characters will result in an `IllegalArgumentException`.

# Testing
This code includes unit tests for the RomanNumerals class. The RomanNumeralsTest class contains two test methods: testToRoman and testFromRoman, which verify the correctness of the toRoman and fromRoman methods, respectively.
```bash
javac -cp junit-platform-console-standalone-1.8.1.jar:. RomanNumeralsTest.java
java -jar junit-platform-console-standalone-1.8.1.jar --class-path . --scan-classpath
```
Ensure that you have the JUnit library (junit-platform-console-standalone) in the same directory as the test class. The output will display the test results, indicating whether each test passed or failed.

## License

This code is provided under the MIT license.
