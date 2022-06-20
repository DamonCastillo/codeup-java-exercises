package util;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);
    public String getString(){
        System.out.println("Get String!");
        return sc.nextLine();
    }
    public void clear() {
        sc.nextLine();
    }
    public boolean yesNo(){
        System.out.println("Yes or No?");
        String userInput = sc.next();

        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yup")) {
            return true;
        } else {
            return yesNo();
        }
    }

    public int getInt(){
        System.out.println("get Integer");
        return sc.nextInt();
    }
    public int getInt( int min, int max){
        System.out.printf("Get whole numbers between %d and %d", min, max);
        int userInput = sc.nextInt();
        if (userInput > min && userInput < max){
            return userInput;
        }else {
            System.out.println("Number not in range");
            return getInt(min,max);
        }
    }
    public double getDouble(){
        System.out.println("Get number");
        return sc.nextDouble();
    }
    public double getDouble(double min, double max){
        System.out.printf("Get whole numbers between %f and %f\n", min, max);
        double userInput = sc.nextDouble();
        if (userInput > min && userInput < max){
            return userInput;
        }else {
            System.out.println("Number not in range");
            return getDouble(min,max);
        }
    }
}
