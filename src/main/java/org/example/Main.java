package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logik logik = new Logik();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Base Conversion Program!");
        System.out.println("Type '!Exit' anytime to quit.");

        while (running) {
            System.out.println("\nPlease choose what you want to do:");
            System.out.println("1 → Convert a number into decimal");
            System.out.println("2 → Convert a decimal number into another base");
            System.out.print("Your choice: ");

            String auswahl = scanner.next();
            if (auswahl.equalsIgnoreCase("!Exit")) break;

            switch (auswahl) {
                case "1":
                    // Conversion into decimal
                    while (true) {
                        System.out.print("Enter the number to convert (or !Exit to go back): ");
                        String input = scanner.next();
                        if (input.equalsIgnoreCase("!Exit")) break;

                        System.out.print("Enter the base of this number: ");
                        int base = scanner.nextInt();

                        try {
                            int result = logik.conversionToDecimal(input.toUpperCase(), base);
                            System.out.println("Decimal value: " + result);
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please try again!");
                        }
                    }
                    break;

                case "2":
                    // Conversion out of decimal
                    while (true) {
                        System.out.print("Enter the decimal number to convert (or !Exit to go back): ");
                        String input = scanner.next();
                        if (input.equalsIgnoreCase("!Exit")) break;

                        System.out.print("Enter the target base: ");
                        int targetBase = scanner.nextInt();

                        try {
                            int number = Integer.parseInt(input);
                            String result = logik.conversionOutOfDecimal(number, targetBase);
                            System.out.println("Value in base " + targetBase + ": " + result);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number! Please enter a decimal integer.");
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Type 1 or 2.");
            }
        }

        System.out.println("Program exited. Goodbye!");
        scanner.close();
    }
}

