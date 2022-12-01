package CondStatements;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        /* Logical OR operator
        At least one is true

        1. true  || true  - true
        2. true  || false - true
        3. false || true  - true
        4. false || false - false
        -----------------------------------------
        Both have to be true
        && (Logical AND)

        1. true  && true  - true
        2. true  && false - false
        3. false && true  - false
        4. false && false - false
        ------------------------------------------*/

       Scanner scan = new Scanner(System.in);
       System.out.print("Bus pass checker");
       System.out.println("Welcome to the Bus Checker");
       System.out.print("How old are you: ");
       int age = scan.nextInt();
       if (age <18){
           System.out.println("You are entitled to a Student Bus Pass!");
       }
       else if (age > 17 & age <66) {
           System.out.println("You are not entitled to a free Bus Pass!");
       }
       else System.out.println("You are not entitled to a freedom Bus Pass!");

    }
}
