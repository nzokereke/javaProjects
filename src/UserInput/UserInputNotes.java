package UserInput;

import java.util.Scanner;

public class UserInputNotes {

    public static void main(String[] args) {
        // import the class scanner
        // then create a scanner object 'new Scanner ()'
        // You need to tell the scanner what to read so within the () add System.in
        // In other words read the input from the keyboard or system input
        new Scanner(System.in);
        // you will also need to store the input in a variable
        Scanner scanner = new Scanner(System.in);
        // by typing the variable scanner'.' we can access the scanners methods
        //.next -- enter input
        System.out.print("What is your name: ");
        // the string variable 'response' will store the input
        String userName = scanner.next();
        System.out.println(userName + " is a nice name\n");
        System.out.print("How old are you "+ userName +"?");
        int userAge = scanner.nextInt();
        System.out.print("So your name is " + userName + " and your are " + userAge+ " years old, is that right ");


    }
}

