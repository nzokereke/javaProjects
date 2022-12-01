package UserInput;

import java.util.Scanner;

public class User_Input {

    public static void main(String[] args) {

        new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name: ");
        String userName = scanner.next();
        System.out.println(userName + " is a nice name\n");

        System.out.print("How old are you "+ userName +"?:");
        int userAge = scanner.nextInt();
        System.out.println("So your name is " + userName + " and your are " + userAge+ " years old, is that right \n");

        System.out.print("How tall are you in meters "+ userName + " ?");
        double userHeight = scanner.nextDouble();
        System.out.println(userName + " you are "+ (double)userHeight + " tall");

        double avgHeightMaleDifference =userHeight - 1.75;
        double avgHeightFemaleDifference =userHeight - 1.63;
        System.out.println("\nthe difference between your height and the average height in meters is" );
        System.out.format("%.2f if you are Male\n",avgHeightMaleDifference );
        System.out.format(" %.2f if you are Female",avgHeightFemaleDifference);






    }
}

