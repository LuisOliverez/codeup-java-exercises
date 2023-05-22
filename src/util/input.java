package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input() {
        sc = new Scanner(System.in);
    }


    //    String getString()
    public String getString() {
        return sc.nextLine();
    }


    //    boolean yesNo()
    public Boolean yesNo() {
        String input = getString().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }


    //    int getInt(int min, int max)
    public int getInt(int min, int max) {
        int value;
        do {
            System.out.printf("Please enter a number between %d and %d: ", min, max);
            while (!sc.hasNextInt()) {
                System.out.printf("Invalid input! Please enter an integer between %d and %d: ", min, max);
                sc.next();
            }
            value = sc.nextInt();
        } while (value < min || value > max);
        sc.nextLine();
        return value;
    }


    //    int getInt()
    public int getInt() {
        System.out.println("Please enter an integer: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer: ");
            sc.next();
        }
        int value = sc.nextInt();
        sc.nextLine();
        return value;
    }


    //    double getDouble(double min, double max)
    public double getDouble(double min, double max) {
        double value;
        do {
            System.out.printf("Please enter a decimal number between %.2f and %.2f: ", min, max);
            while (!sc.hasNextDouble()) {
                System.out.printf("Invalid input! Please enter a decimal number between %.2f and %.2f: ", min, max);
                sc.next();
            }
            value = sc.nextDouble();
        } while (value < min || value > max);
        sc.nextLine();
        return value;
    }



//    double getDouble()
public double getDouble(){
    System.out.println("Please enter a decimal number: ");
    while (!sc.hasNextDouble()){
        System.out.print("Invalid input! Please enter a decimal number: ");
        sc.next();
    }
    double value = sc.nextDouble();
    sc.nextLine();
    return value;

    }
public void close(){
        sc.close();

    }

}

