package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();


        System.out.println("Enter a string: ");
        String userInputString = input.getString();
        System.out.println("String entered was: " +userInputString);


        System.out.println("Enter yes or no: ");
        boolean userInputBoolean = input.yesNo();
        System.out.println("User entered: " +userInputBoolean);


        int userInputIntInRange = input.getInt(1 ,10);
        System.out.println("Ranged integer entered was: " +userInputIntInRange);


        int userInputInt = input.getInt();
        System.out.println("Integer entered was: " +userInputInt);


        double userInputDoubleInRange = input.getDouble(0.0, 100.0);
        System.out.println("Double entered was: " +userInputDoubleInRange);

        input.close();


    }
}
