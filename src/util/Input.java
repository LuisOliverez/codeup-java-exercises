package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = getString();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        int value = 0;
        do {
            System.out.printf("Please enter an integer between %d and %d: ", min, max);
            String input = getString();
            try {
                value = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                continue;
            }
        } while (value < min || value > max);
        return value;
    }

    public int getInt() {
        int value;
        while (true) {
            System.out.print("Please enter an integer: ");
            String input = getString();
            try {
                value = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
        return value;
    }

    public double getDouble(double min, double max) {
        double value = 0;
        do {
            System.out.printf("Please enter a decimal number between %.2f and %.2f: ", min, max);
            String input = getString();
            try {
                value = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid decimal number.");
                continue;
            }
        } while (value < min || value > max);
        return value;
    }

    public double getDouble() {
        double value;
        while (true) {
            System.out.print("Please enter a decimal number: ");
            String input = getString();
            try {
                value = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid decimal number.");
            }
        }
        return value;
    }

    public void close() {
        scanner.close();
    }





}