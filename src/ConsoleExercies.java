import java.util.Scanner;

public class ConsoleExercies {
    public static void main(String[] args) {
//        String name = "Paul";
//        System.out.println("Hi, I'm " + name + " !\n");
//        System.out.println("I like cheese\n");
//
//        System.out.printf("Hi, I'm %s! I'm %.1f years old!\n",name, 28.5 );
//
//
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hey, tell me about the NBA finals: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("You said: " + userInput);

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f\n",pi);
//
//
//        System.out.println("Hey, what is your Favorite Number? \n");
//        int userInput = scanner.nextInt();
//
//        System.out.println("Your favorite num is : \n" + userInput);

//        System.out.println("Please Enter Three Words");
//
//        String words1 = scanner.next();
//        String words2 = scanner.next();
//        String words3 = scanner.next();
//
//        System.out.println("\n" + words1 + "\n" + words2 + "\n" +words3);


//        System.out.println("Enter a Statement");
//
//        String statement = scanner.nextLine() ;
//
//        System.out.println("You Entered: \n" + statement);


        System.out.println(" Please enter the Width of your classroom");

        Integer width = Integer.valueOf(scanner.nextLine());

        System.out.println(" Please enter the Length of your classroom");

        Integer length = Integer.valueOf(scanner.nextLine());

        Integer area = width * length;

        System.out.println("The area of the Classroom is :" + area + "sq" );
        Integer  param = width * 2 + length * 2;
        System.out.println("and the parameter of the class room is : " + param);

    }
}
