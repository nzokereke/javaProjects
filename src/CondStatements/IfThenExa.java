package CondStatements;

import java.util.Scanner;
//-------------Coding Challenge 3 - if - then - statements ------------------------
// Write a program with two int variables, int x and int y, and give each one a value.
// Depending on their values, print x is bigger than y , x is smaller than y or x and y
// are the same. Change the values and run the program a few times.

public class IfThenExa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a value for x: ");
        int x =scan.nextInt();

        System.out.print("Enter a value for y: ");
        int y =scan.nextInt();

        if(x>y) {
            System.out.println("x is greater than y");
        }
        else if (x < y) {
            System.out.println("x is smaller than y");
        }
        else{
            System.out.println("x is equal to y");
        }

    }
}
