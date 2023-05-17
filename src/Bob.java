import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "";
        System.out.println("Say or ask Bob something.");

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
