package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
       this.scanner = new Scanner(System.in);
    }


    //    String getString()
    public String getString() {
        return this.scanner.nextLine();
    }


    //    boolean yesNo()
    public Boolean yesNo() {
        if (scanner.nextLine().equalsIgnoreCase("yes") || scanner.nextLine().equalsIgnoreCase("y")){
            return true;
        }else {
            return false;
        }
    }


    //    int getInt(int min, int max)
    public int getInt(int min, int max) {
        int value;
        do {
            System.out.printf("Please enter an integer between %d and %d: ", min, max);
            while (!scanner.hasNextInt()) {
                System.out.printf("Invalid input! Please enter an integer between %d and %d: ", min, max);
                scanner.next();
            }
            value = scanner.nextInt();
        } while (value < min || value > max);
        scanner.nextLine();
        return value;
    }


    //    int getInt()
    public int getInt() {
        System.out.println("Please enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }


    //    double getDouble(double min, double max)
    public double getDouble(double min, double max) {
        double value;
        do {
            System.out.printf("Please enter a decimal number between %.2f and %.2f: ", min, max);
            while (!scanner.hasNextDouble()) {
                System.out.printf("Invalid input! Please enter a decimal number between %.2f and %.2f: ", min, max);
                scanner.next();
            }
            value = scanner.nextDouble();
        } while (value < min || value > max);
        scanner.nextLine();
        return value;
    }



//    double getDouble()
public double getDouble(){
    System.out.println("Please enter a decimal number: ");
    while (!scanner.hasNextDouble()){
        System.out.print("Invalid input! Please enter a decimal number: ");
        scanner.next();
    }
    double value = scanner.nextDouble();
    scanner.nextLine();
    return value;

    }
public void close(){
        scanner.close();

    }



    public static void main(String[] args) {
        Input inputOne = new Input();
        System.out.println("yesNo");
        System.out.println(inputOne.yesNo());
    }
}