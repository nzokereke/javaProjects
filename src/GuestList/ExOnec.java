package GuestList;

import java.util.Scanner;

public class ExOnec {
    static String[] guest = new String[10];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Exercise 4
        // Move the section of code which
        // displays the guests into its own method called displayGuests(), and call the method instead.
        // Exercise 5
        // Repeat Exercise 4 but this time move the menu code into a method called displayMenu().
        //Exercise 6
        // Repeat Exercise 4 but this time move the input code for the menu option into a method
        // called getOption(). Have this method return the option so that the if-statement can still check it
        //Exercise 7
        //Print a number beside each guest from 1 to 10.
        // Exercise 8
        // modify the program so that when a name is removed, all subsequent elements are shifted up to fill the gap.

        guest[0] = "Abraham";
        guest[1] = "Benjamin";
        guest[2] = "David";
        guest[3] = "Elijah";
        guest[4] = "Ruth";
        guest[5] = null;
        guest[6] = "Hannah";
        guest[7] = "Moses";
        guest[8] = "Joshua";
        guest[9] = null;

        do {
            displayGuest();
            displayMenu();
            int ans = getOption();

            // Add Guest
            if (ans == 2) {
                System.out.print("Enter Name Of Guest: ");
                String guestName = input.next();
                for (int i = 0; i < guest.length; i++) {
                    if (guest[i] == "--") {
                        guest[i] = guestName;
                        break;
                    }
                }
            }

            // Remove Guest
            if (ans == 3) {
                System.out.print("Enter Name Of Guest: ");
                String name = input.next();

                for (int i = 0; i < guest.length; i++) {
                    if ((!guest[i].equals("--") && guest[i].equals(name))) {
                        guest[i] = "--";
                        break;
                    }
                }
                String hold[] = new String[guest.length];
                int a = 0;
                for (int i = 0; i < guest.length; i++) {
                    if (guest[i] != "--") {
                        hold[a] = guest[i];
                        a++;
                    }
                }
               guest = hold;
               //break;
            }


            // Exit Program
            if (ans == 4) {
                    System.out.println("Exiting........................................ ");
                    break;
                }
            }

        while (true) ;

        }

        public static void displayGuest () {
            System.out.println("__________________________________________________");
            System.out.println("- List Of Guest - ");
            for (int i = 0; i < guest.length; i++) {
                //int x = i;
                if (guest[i] == null) {
                    guest[i] = "--";
                }
                System.out.println((i + 1) + ". " + guest[i]);
            }
        }
        public static void displayMenu () {
            System.out.println("--------------------------------------------------");
            System.out.println("- Menu - ");
            System.out.println("2 - Add Guests");
            System.out.println("3 - Remove Guests");
            System.out.println("4 - Exit");

        }
        public static int getOption () {
            System.out.print("Enter an option: ");
            int ans = input.nextInt();
           return ans;

        }

    }
