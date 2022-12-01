package CondStatements;

import java.util.Scanner;

public class StringEq {
    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter how old are you: ");
        int age = scan.nextInt();
        if (age < 18){
            System.out.print("You are entitled to Buss Pass because you are under 18");
        }
        if (age >= 18) {
            System.out.print("\nAre you claiming any state benefit yes/no: ");
            String benefit = scan.next();
            if (benefit.equals("yes")  ) {
                System.out.println(" \nYou are entitled to Bus Pass because you are 18 years or over  and receiving benefit");
             }
            else {
                System.out.println(" \nYou are NOT entitled to Bus Pass because you are 18 years or over and NOT receiving benefit");
            }
        }
    }
}

