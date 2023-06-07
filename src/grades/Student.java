package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    //constructor for name and initializes grades as ArrayList
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    //Name setter(getName method)
    public String getName() {
        return name;
    }

    //method to add grade to ArrayList using (.add) and passing grade through it
    public void addGrade(int grade){
        grades.add(grade);
    }

    //getGradeAverage method
    public double getGradeAverage(){
        if (grades.isEmpty()){
            return 0.0;//if no grades return 0
        }else {//otherwise calculate grade
            int sum = 0;
            for (int grade : grades){
                sum += grade;
            }
            return (double) sum / grades.size();//calculate average grade(.size counts how many items in an array {sum/number of grades)
        }
    }




}
