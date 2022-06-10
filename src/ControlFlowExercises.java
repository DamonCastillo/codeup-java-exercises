import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i<=15){
//            System.out.println(i++);
//        }
//        for (int i=5; i <=15; i++){
//            System.out.println(i);
//        }
//        int n = 5;
//        long i =2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }
//        while(i <= 100000);

//        for (long i = 2; i <= 1000000; i*=i){
//            System.out.println(i);
//        }
        //Fizzbuzz

//        for (int i = 0; i < 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz: " + i);
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz: " + i);
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz: " + i);
//            } else{
//                System.out.println("not a multiple of either 3 or 5: " + i);
//            }
//        }

        //Power Table
        Scanner sc = new Scanner(System.in);
//        String choice = "y";
//      do {
//          System.out.println("Please Enter a Number..");
//          int userInput = sc.nextInt();
//
//          String Title = "Number" + " | " + "Squared" + " |" + "Cubed" + "\n"
//                  + "------" + " | " + "------" + "  |" + "------";
//          System.out.println(Title);
//
//          for (int i = 1; i <= userInput; i++) {
//              System.out.println(i + "      | " + (i * i) + "       |" + (i * i * i));
//          }
//          System.out.print("Continue? (y/n): ");
//          choice = sc.next();
//          System.out.println();
//      }
//         while (!choice.equalsIgnoreCase("n")) ;


        String choice = "y";
        do {
            System.out.println("What was your Number Grade? ");
            int userGrade = sc.nextInt();
            if (userGrade >= 88) {
                System.out.println("You received an A");
            } else if (userGrade >= 80 & userGrade <= 87) {
                System.out.println("You received a B");
            } else if (userGrade >= 67 & userGrade <= 79) {
                System.out.println("You received a C");
            } else if (userGrade >= 60 & userGrade <= 66) {
                System.out.println("You received a D");
            } else {
                System.out.println("You received a F");
            }
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        } while (!choice.equalsIgnoreCase("n"));

    }
}





