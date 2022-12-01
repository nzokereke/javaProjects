package CondStatements;

import java.util.Scanner;

/* modify the program from previous exercise ifThenExa, so it also prints the difference between x and y */

public class IfThenExb {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a value for x: ");
        int x =scan.nextInt();

        System.out.print("Enter a value for y: ");
        int y =scan.nextInt();

        if(x>y) {
            System.out.println("x is greater than y");
            System.out.println("the difference between x and y is: " + (x-y));
        }
        else if (x < y) {
            System.out.println("x is smaller than y");
            System.out.println("the difference between x and y is: " + (x-y));
        }
        else{
            System.out.println("x is equal to y");
        }
    }
}
