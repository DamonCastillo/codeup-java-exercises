import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

    public static int Addition(int i, int j) {
        return i + j;
    }

    public static int Subtraction(int i, int j) {
        return i - j;
    }

    public static int Multiplication(int i, int j) {
        return i * j;
    }

    public static int Division(int i, int j) {
        return i / j;
    }

    public static int recursionMultiply(int a, int b) {

        if ((a == 0) || (b == 0))
            return 0;
        else
            return (a + recursionMultiply(a, b - 1));

    }


    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = sc.nextInt();
        if (userInput > max || userInput < min) {
            return getInteger(min, max);
        }
        return userInput;

    }


    public static void factorial () {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
      do {
          int userInput = getInteger(1, 10);
          long userFactorial = 1;
          for (int i = 1; i <= userInput; i++) {
              userFactorial *= i;
              System.out.println(userFactorial);
          }
          System.out.println(userFactorial);
          System.out.print("Continue? (y/n): ");
          choice = sc.next();
          System.out.println();
      }while(!choice.equalsIgnoreCase("n"));
    }


    public static void diceGame() {
        Scanner input = new Scanner(System.in);
        String choice = "y";
        do {
            System.out.println("How many sides are on the Dices?");
            int numOfSides = input.nextInt();

            Random ranNum = new Random();

            System.out.println("You rolled:");
            int randomNumber = 0;
            for (int i = 0; i < 2; i++) {
                randomNumber = ranNum.nextInt(numOfSides)  + 1;
                System.out.print(randomNumber);
                System.out.print(" ");
            }
            System.out.println("Continue? (y/n): ");
            choice = input.next();
            System.out.println();


        } while (!choice.equalsIgnoreCase("n"));

    }



    public static void main(String[] args) {
        // Basic Arithmetic
//        System.out.println(Addition(4, 6));
//        System.out.println(Subtraction(10, 7));
//        System.out.println(Multiplication(5, 5));
//        System.out.println(Division(25, 2));
//        System.out.println(recursionMultiply(6, 12));
//        factorial();
        diceGame();


    }
}
