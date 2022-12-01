package Array;

import java.util.Scanner;

public class ArraySize {
    public static void main(String[] args) {
        String [] predictions = new String[5];
        Scanner scan = new Scanner(System.in);

        predictions[0] = "You will become a leading figure in politics ";
        predictions[1] = "You will become a successful entrepreneur ";
        predictions[2] = "You will be a master in your field of study ";
        predictions[3] = "You will end world hunger ";
        predictions[4] = "You will be a pioneer ";
    System.out.print("I will predict your future, select a number between 1 - 5: " );
      int answer = scan.nextInt() - 1;
    System.out.print(predictions[answer]);
    }
}