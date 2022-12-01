package CondStatements;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class IfThenExc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 5);

        System.out.print("\nIm thinking of a number between 1-5 try and guess it: ");
        int y = scan.nextInt();


        if (randomNumber == y) {
            System.out.println("Correct Aren't You Lucky!");
        }
        else {
            System.out.print("Hard Luck, Maybe Next Time");
            System.out.print("\nTry again: ");
            y = scan.nextInt();
            if (randomNumber == y) {
                System.out.print("\nAt last you got there in the end");
                }
                else {
                        System.out.println("You've run out of chances ");
                }

            }
        }
    }


