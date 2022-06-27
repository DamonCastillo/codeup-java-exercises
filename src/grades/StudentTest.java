package grades;

import java.util.ArrayList;

public class StudentTest extends Student {

    public StudentTest(String name, ArrayList<Double> grades) {
        super(name, grades);
    }

    public static void main(String[] args) {
        Student bob = new Student("Bob",new ArrayList<>());
        bob.addGrade(44);
        bob.addGrade(44);
        bob.addGrade(44);
        System.out.println(bob.getGrades());
    }
}
