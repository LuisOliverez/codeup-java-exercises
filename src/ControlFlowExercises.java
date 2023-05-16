//import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

// -------------------------#1---------------------
//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i);
//            i++;
//        }

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }while (i < 1000000L);

//if int has capacity, why is a long needed to prevent overflow???


//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000L);


//        for (long i = 2; i <1000000L; i *= i){
//            System.out.println(i);
//        }


// -------------------------#2---------------------

//        for(int i = 1; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 ==0){
//                System.out.println("FizzBuzz");
//            }else if(i %3 == 0){
//                System.out.println("Fiz");
//            } else if (i % 5 ==0) {
//                System.out.println("Buzz");
//            }else {
//                System.out.println(i);
//            }
//        }
//


// -------------------------#3---------------------


//        Scanner sc = new Scanner(System.in);//prompt user for number
//        System.out.println("what number would you like to go up to?");
//        int limit = sc.nextInt();
//
//
//        System.out.println("Number\tSquare\tCube");//table header
//            for (int i = 1; i <= limit; i++){
//                int square = i * i;//calculate squared
//                int cube = i * i * i;//calculate cubed
//
//                System.out.printf("%-6d | %-7d | %-5d\n",i,square,cube);//display the values in tabular format
//            }


// -------------------------#4---------------------

        Scanner sc = new Scanner(System.in);
        String choice = "";

        do {
            System.out.println("Please enter a numerical grade from 1-100");
            int numGrade = sc.nextInt();
            sc.nextLine();
            String letterGrade;
            if (numGrade >= 88) {
                letterGrade = "A";
            } else if (numGrade >= 80) {
                letterGrade = "B";
            } else if (numGrade >= 67) {
                letterGrade = "C";
            } else if (numGrade >= 59) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }

            System.out.println("Letter grade is: " + letterGrade);

            System.out.print("Would you like to continue? (yes/no): ");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Goodbye!");

        sc.close();

    }


}
