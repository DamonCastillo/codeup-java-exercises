import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        do {
            System.out.println("What's Up?");
            String input = sc.nextLine();
            if (input.endsWith("?")) {
                System.out.println("Sure");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa,chill out!");
            } else if (input.equals("")) {
                System.out.println("Fine.Be that way!");
            } else {
                System.out.println("Whatever");
            }

          choice = sc.next();
          System.out.println();
        } while (!choice.equalsIgnoreCase("n"));
    }
}
