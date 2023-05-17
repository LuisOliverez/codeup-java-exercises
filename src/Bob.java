import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a question or comment for Bob?");

            String userInput = sc.nextLine();
            String response;
            if (userInput.endsWith("?")) {
                response = "Sure";
            } else if (userInput.endsWith("!")) {
                response = "Whoa, chill out!";
            } else if (userInput.equals("")){
                response = "Fine. Be that way!";
            }else {
                response = "Whatever";
            }

            System.out.println("Bob: " + response);
        }
    }
