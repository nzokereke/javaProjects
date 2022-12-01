package Array;
import java.util.Scanner;
public class ArrayExd {
    public static void main(String[] args) {

        // Exercise 4
        // Write a program which asks the user to enter their top five favourite foods and store their answers in a string array.
        // However, create the array so it can only hold a maximum of three strings.
        // After the user enters the third item, print “No more memory available.”, then print out the contents of the array

        String[] food = new String[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your top favourite food: ");

        for (int i = 0; i<food.length; i++){
             String ans = scan.nextLine();
             food[i] = ans;
            if (i == 4){
                System.out.println("no more memory available");
            }
        }
    }
}