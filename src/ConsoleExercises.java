import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){


        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n.", pi);


        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String word1 = scanner1.nextLine();

        System.out.println("Enter the second word:");
        String word2 = scanner1.nextLine();

        System.out.println("Enter the third word:");
        String word3 = scanner1.nextLine();

        System.out.println("You entered: ");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);


//        will not accept more than 3 lines. each line will accept more than one word or no words

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner2.nextLine();

        System.out.println("Your sentence was: ");
        System.out.println(sentence);

//only the first word was captured w/scanner2.next.
//using scanner2.nextLine captures the entire sentence. next captures first token and stops at white space. .nextLine captures entire line


        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Enter the length of your classroom: ");
        String lengthInput = scanner3.nextLine();
        double length = Double.parseDouble(lengthInput);

        System.out.println("Enter the width of your classroom: ");
        String widthInput = scanner3.nextLine();
        double width = Double.parseDouble(widthInput);

        System.out.println("The area of your classroom is: " + (length*width) + " SqFt");
        System.out.println("The perimeter of your classroom is: " + 2* (length*width)+ "ft");


    }
}
