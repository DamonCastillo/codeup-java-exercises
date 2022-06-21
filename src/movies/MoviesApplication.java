package movies;

import java.util.ArrayList;
import java.util.Scanner;

public class MoviesApplication {
    public static String userInput;

    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Would like to see all movies or search by category?");
        userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("all")){
        }
    }


}
