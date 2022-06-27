package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String,Student> students = new HashMap<>();
        //1st Student
        Student kent = new Student("kentDaDarkL0rd",new ArrayList<>());
        kent.addGrade(89);
        kent.addGrade(84);
        kent.addGrade(92);
        //2nd Student
        Student claire = new Student("UwUKat",new ArrayList<>());
        claire.addGrade(58);
        claire.addGrade(85);
        claire.addGrade(96);
        //3rd Student
        Student chris = new Student("ChrisIzTooCrisp",new ArrayList<>());
        claire.addGrade(77);
        claire.addGrade(95);
        claire.addGrade(96);
        //4th Student
        Student gerald = new Student("GeraldTheWhyteWulf",new ArrayList<>());
        claire.addGrade(90);
        claire.addGrade(43);
        claire.addGrade(39);
        //Putting them into the hashmap
        students.put("kentDaDarkL0rd",kent);
        students.put("UwUKat",claire);
        students.put("ChrisIzTooCrisp",chris);
        students.put("GeraldTheWhyteWulf",gerald);


    }
}
