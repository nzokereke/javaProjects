package CondStatements;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter a number between 1 - 3: ");
        int score = scan.nextInt();
        switch (score) {
            case 1 -> System.out.println("You selected 1");
            case 2 -> System.out.println("You selected 2");
            case 3 -> System.out.println("You selected 3");
            default -> System.out.println("You did not select 1, 2 or 3");
        }

    }
}
