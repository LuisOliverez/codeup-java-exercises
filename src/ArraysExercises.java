import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        String [] peopleArr = {"Tim", "Jim", "Kim"};
        String personToAdd = "Bob";

        String[] updatedPeople = new String[peopleArr.length + 1];
        for (int i= 0 ; i< peopleArr.length ; i++) {
            updatedPeople[i]= peopleArr[i];
        }
        updatedPeople[updatedPeople.length -1]=personToAdd;
        System.out.println(Arrays.toString(updatedPeople));


        for (String people : updatedPeople) {
            System.out.println(people);

        }

    }
}
