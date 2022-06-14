import java.util.Scanner;


public class HighLow {
    public static void playGame (String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() *100) +1;
        System.out.println("guess the number between 1-100");
        int userInput = sc.nextInt();
        if (userInput == randomNumber){
            System.out.println("good Guess");
        }else if
        (userInput < randomNumber){
            System.out.println("Higher");
        }else if (userInput > randomNumber){
            System.out.println("lower");

        }

    }
    public static void main(String[] args) {

    }

}
