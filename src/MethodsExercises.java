import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {


    //   CLASSES #1
    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static double Division(double num1, double num2) {
        return num1 / num2;
    }

    public static int Modulus(int num1, int num2) {
        return num1 % num2;
    }


    //#2
    public static void getInteger (int min, int max){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number between " +min+ " and " +max+ ": ");
    int userInput = sc.nextInt();

        if (userInput >= min && userInput <= max) {
            System.out.println(userInput +" is a valid input!");
        } else {
            System.out.println("Invalid input! Please try again.");
            getInteger(min, max); //recursive call with same parameters/conditions.
        }
    }

    //#3
    public static int getFactorial(int userInt){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int userInput = sc.nextInt();
        return userInput;
    }




    //  MAIN  #1
    public static void main(String[] args) {
        int sum = Addition(5, 3);
        System.out.println("Sum is: " + sum);

        int diff = Subtraction(5, 3);
        System.out.println("Difference is: " + diff);

        int product = Multiplication(5, 3);
        System.out.println("Product is: " + product);

        double quotient = Division(5, 3);
        System.out.println("Quotient is: " + quotient);

        int remainder = Modulus(12, 2);
        System.out.println("Remainder is: " + remainder);


        //#2
        int min= 1;
        int max = 10;
        getInteger(min, max);


        //#3






    }
}


