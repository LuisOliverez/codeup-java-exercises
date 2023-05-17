import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("This is Bob.");
        String userAnswer;

        do {
            System.out.println("Get Bobs attention, please.");

            String userInput = sc.nextLine().trim();
            String response;

            if (userInput.equals("")) {
                response = "Fine. Be that way!";
            } else if (userInput.endsWith("!")) {
                response = "Whoa, chill out!";
            } else if (userInput.endsWith("?")){
                response = "Sure";
            }else {
                response = "Whatever";
            }

            System.out.println("Bob said: " + response);
            System.out.println("Would you like to continue(y/n)");
                userAnswer = sc.nextLine();
        }while (userAnswer.equalsIgnoreCase("y"));
    }
}