package UserInput;

import java.util.Scanner;

public class UserInputExa {
    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you?  ");
        int years = scanner.nextInt();
        System.out.print("You've lived " + years + " years, In another " + years + " years you'll be " + (years * 2)+ " years old\n");

        System.out.print("\nWhat is your name ");
        String name = scanner.next();
        System.out.println("Your name is " + name + " and the number of characters in your name is "+name.length());





    }
}
