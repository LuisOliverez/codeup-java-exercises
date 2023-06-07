package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {


   private static HashMap<String, Student> students = new HashMap<>();
    public static void main(String[] args) {

        //create HashMap



        //Create Student objects and add them to the map with (.put)
        Student student1 = new Student("John Bone Jovi");
        student1.addGrade(80);
        student1.addGrade(89);
        student1.addGrade(94);
        student1.addGrade(79);
        students.put("bonecollector", student1);

        Student student2 = new Student("Pawl McCarteny");
        student2.addGrade(85);
        student2.addGrade(82);
        student2.addGrade(74);
        student2.addGrade(89);
        students.put("bigpawlpa", student2);

        Student student3 = new Student("Catty Bates");
        student3.addGrade(92);
        student3.addGrade(89);
        student3.addGrade(94);
        student3.addGrade(87);
        students.put("anniewiskers", student3);

        Student student4 = new Student("Rumple Stiltskin ");
        student4.addGrade(76);
        student4.addGrade(50);
        student4.addGrade(79);
        student4.addGrade(86);
        students.put("fibcrib", student4);

        Student student5 = new Student("Robert Boucher");
        student5.addGrade(87);
        student5.addGrade(85);
        student5.addGrade(98);
        student5.addGrade(79);
        students.put("bobbywaters", student5);




        //create Scanner object to capture input
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            //FOR LOOP TO PRINT OUT ALL USERNAMES
            System.out.println("Here are the GitHub usernames of our students: ");
            for (String username : students.keySet()) {
                System.out.print("| " +username+ " |");
            }


            //prompt user for input
            System.out.println("\nEnter a username to see more about them:");
            String enteredname = sc.nextLine();

            //retrieve the student from the map
            Student selectedStudent = students.get(enteredname);

            //check if the student exists in the map
            if (selectedStudent != null) {
                System.out.println("Name: " + selectedStudent.getName());
                System.out.println("Average Grade: " + selectedStudent.getGradeAverage());
            } else {
                System.out.println("That student does not exist");
            }
            System.out.println("Would you like to continue?(y/n)");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("y"));
        System.out.println("Have a great day!!!!");
    }

}