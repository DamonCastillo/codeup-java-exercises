package grades;

import java.util.ArrayList;

public class Student {
    private String name;

    public ArrayList<Double> getGrades() {
        return grades;
    }

    private ArrayList<Double> grades;


    public Student(String name, ArrayList<Double> grades) {
        this.name = name;
        this.grades = grades;
    }



    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(double grade) {
    grades.add(grade);

    }
    // returns the average of the students grades
    public void  getGradeAverage() {
        int i;
        int length = grades.size();
        int sum = 0;
        for (i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
    double average = sum/length;
    }
}
