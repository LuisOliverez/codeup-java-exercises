import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        //UNCOMMENT ONE PROBLEM AT A TIME, BE SURE TO INCLUDE BOTH '}'
        // AT THE END OF EACH PROBLEM :)

        // #1

//        int sum = Addition(5, 3);
//        System.out.println("Sum is: " + sum);
//
//        int diff = Subtraction(5, 3);
//        System.out.println("Difference is: " + diff);
//
//        int product = Multiplication(5, 3);
//        System.out.println("Product is: " + product);
//
//        double quotient = Division(5, 3);
//        System.out.println("Quotient is: " + quotient);
//
//        int remainder = Modulus(5, 3);
//        System.out.println("Remainder(modulus) is: " + remainder);
//    }
//
//
//        public static int Addition ( int num1, int num2){
//            return num1 + num2;
//        }
//
//        public static int Subtraction ( int num1, int num2){
//            return num1 - num2;
//        }
//
//        public static int Multiplication ( int num1, int num2){
//            return num1 * num2;
//        }
//
//        public static double Division ( double num1, double num2){
//            return num1 / num2;
//        }
//
//        public static int Modulus ( int num1, int num2){
//            return num1 % num2;
//        }
//    }


        //#2

//        int min = 1;
//        int max = 10;
//        getInteger(min, max);
//    }
//
//        public static void getInteger (int min, int max){
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter a number between " + min + " and " + max + ": ");//ask for between1-10
//            int userInput = sc.nextInt();
//
//            if (userInput >= min && userInput <= max) {//check if userinput is between 1-10
//                System.out.println(userInput + " is a valid input!");//display user input
//            } else {//otherwise
//                System.out.println("Invalid input! Please try again.");
//                getInteger(min, max); //recursive call with same parameters/conditions IF invalid.
//            }
//
//        }
//    }


        //#3

//        Scanner sc = new Scanner(System.in);
//        String choice;
//
//        do {
//            int number;
//
//            do {
//                System.out.println("Please enter a number between 1-10 and find its Factorial");
//                number = sc.nextInt();
//            } while (number < 1 || number > 10);
//
//            long factorial = calculateFactorial(number);
//            System.out.println(number + "! =" + getFactorialFormula(number) + " = " + factorial);
//
//            System.out.println("Do you want to continue? (y/n): ");
//            choice = sc.next();
//
//        } while (choice.equalsIgnoreCase("y"));
//    }
//
//    public static long calculateFactorial(int n) {
//        long factorial = 1;
//        for (int i = 1; i <= n; i++) {
//            factorial *= i;
//        }
//        return factorial;
//    }
//
//
//    public static String getFactorialFormula(int n) {
//        StringBuilder formula = new StringBuilder();
//        for (int i = n; i >= 1; i--) {
//            formula.append(i);
//            if (i > 1) {
//                formula.append(" x ");
//            }
//        }
//        return formula.toString();
//
//
//    }
// }

        //#4
        Scanner sc = new Scanner(System.in);
        String choice;

        do {


            System.out.println("How many sides would you like on your set of dice?");
            int numberOfSides = sc.nextInt();


            int dice1 = (int) (Math.random() * numberOfSides + 1);
            int dice2 = (int) (Math.random() * numberOfSides + 1);
            int sum = (dice1+dice2);
            System.out.println("Dice #1 is: " +dice1);
            System.out.println("And dice #2 is: "+ dice2);
            System.out.println("You rolled a " + sum);
            System.out.println("Do you want to roll again? (y/n): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("y"));


    }
}




