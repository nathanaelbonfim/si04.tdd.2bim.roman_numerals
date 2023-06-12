/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.si.tdd.numeraisromanos;

import java.util.Scanner;

/**
 *
 * @author nathanael
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            printMenu();
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    convertToRoman(scanner);
                    break;
                case 2:
                    convertFromRoman(scanner);
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void printMenu() {
        String title = "Roman Numeral Converter";
        String menu = "1. Convert from Arabic to Roman\n"
                + "2. Convert from Roman to Arabic\n"
                + "3. Exit\n";
        String separator = "---------------------------";

        System.out.println(separator);
        System.out.println(title);
        System.out.println(separator);
        System.out.println(menu);
        System.out.println(separator);
        System.out.print("Select an option: ");
    }

    private static void convertToRoman(Scanner scanner) {
        System.out.print("Enter an Arabic number: ");
        int arabicNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String romanNumber = RomanNumerals.toRoman(arabicNumber);
        System.out.println("Roman numeral: " + romanNumber);

        askToContinue(scanner);
    }

    private static void convertFromRoman(Scanner scanner) {
        System.out.print("Enter a Roman numeral: ");
        String romanNumber = scanner.nextLine().toUpperCase();

        int arabicNumber = RomanNumerals.fromRoman(romanNumber);
        System.out.println("Arabic number: " + arabicNumber);

        askToContinue(scanner);
    }

    private static void askToContinue(Scanner scanner) {
        System.out.print("Convert another number? (Y/N): ");
        String answer = scanner.nextLine().toUpperCase();

        if (answer.equals("N")) {
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }
}
