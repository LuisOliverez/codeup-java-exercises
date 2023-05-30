package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        //create HashMap
        HashMap<String, Student> students = new HashMap<>();


        //Create Student objects and add them to the map with (.put)
        Student student1 = new Student("John Bone Jovi");
        student1.addGrade(80);
        student1.addGrade(89);
        student1.addGrade(94);
        student1.addGrade(79);
        students.put("bonecollector1843", student1);

        Student student2 = new Student("Pawl McCarteny");
        student2.addGrade(85);
        student2.addGrade(82);
        student2.addGrade(74);
        student2.addGrade(89);
        students.put("bigpawlpa1725", student2);

        Student student3 = new Student("Catty Bates");
        student3.addGrade(92);
        student3.addGrade(89);
        student3.addGrade(94);
        student3.addGrade(87);
        students.put("anniewiskers2319", student3);

        Student student4 = new Student("Rumple Stiltskin ");
        student4.addGrade(76);
        student4.addGrade(50);
        student4.addGrade(79);
        student4.addGrade(86);
        students.put("fibcrib5317", student4);

        Student student5 = new Student("Robert Boucher");
        student5.addGrade(87);
        student5.addGrade(85);
        student5.addGrade(98);
        student5.addGrade(79);
        students.put("bobbywaters1330", student5);


        //FOR LOOP TO PRINT OUT ALL USERNAMES AND AVERAGE GRADE
        for (String username : students.keySet()){
            Student student = students.get(username);
            double averageGrade = student.getGradeAverage();
            System.out.println("Usernames: " +username);
            //System.out.println("Average Grade: " +averageGrade);
        }

    }
}
