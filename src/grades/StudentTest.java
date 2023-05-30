package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John Jacob");
        Student student2 = new Student("Pawl Rubb");

        student1.addGrade(80);
        student1.addGrade(87);
        student1.addGrade(76);
        student1.addGrade(93);


        student2.addGrade(78);
        student2.addGrade(75);
        student2.addGrade(68);
        student2.addGrade(89);


        System.out.println(student1.getName()+ "'s average grade is: " +student1.getGradeAverage());
        System.out.println(student2.getName()+ "'s average grade is: " +student2.getGradeAverage());
    }

}
