import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

// -------------------------#1---------------------//
//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        long i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        }while (i <= 100);

//
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        }while (i >= -10);


//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000L);


        for (long i =100; i >= -10; i -= 5){
            System.out.println(i);
        }


        for (long i = 2; i <1000000L; i *= i){
            System.out.println(i);
        }


// -------------------------#2---------------------//

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            }else if(i %3 == 0){
                System.out.println("Fiz");
            } else if (i % 5 ==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }



// -------------------------#3---------------------//


        boolean confirm = true;

        do {
            Scanner sc = new Scanner(System.in);//prompt user for number
            System.out.println("what number would you like to go up to?");
            int userInput = sc.nextInt();

            System.out.println("Here is your table!");
            System.out.println("Number\tSquared\tCubed");//table header
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userInput; i++) {
                int square = i * i;//calculate squared
                int cube = i * i * i;//calculate cubed

                System.out.printf("%-6d | %-7d | %-5d\n", i, square, cube);//display the values in tabular format
            }
            System.out.println("Continue?(y/n)");
            confirm = sc.next().equalsIgnoreCase("y");
        }while(confirm);
        System.out.println("Have a good day!");

// -------------------------#4---------------------//

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

            System.out.print("Would you like to continue? (y/n): ");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");

        sc.close();

    }
}