package GuestList;

import java.util.Scanner;


public class ExOne {
    public static void main(String[] args) {
        //Exercise 1
        // when ever a null is encountered in the array, don't print null, print two dashes instead

        //Exercise 2
        // Above the guests and the menu, add some sort of title. Below is one possible solution
        // which uses a series of underscores to form a line which acts as a separator.
        // Underneath these lines are suitable titles with two dashes either side


        Scanner input = new Scanner(System.in);

        String[] guest = new String[10];
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
            System.out.println("__________________________________________________");
            System.out.println("- Menu - ");
            System.out.println("1 - Display All Guests");
            System.out.println("2 - Add Guests");
            System.out.println("3 - Remove Guests");
            System.out.println("4 - Exit");
            System.out.print("Enter an option: ");
            int ans = input.nextInt();
            if (ans == 1)  {
                System.out.println("__________________________________________________");
                System.out.println("- Guest -");
                for (String s : guest) {
                     if (s == null) {
                     s = "--";

                     }
                     System.out.println(s);
                }
           }
           if (ans == 2)  {
               System.out.println("Enter Name Of Guest: ");
               for (int i =0; i< guest.length;i++) {
                   if (guest[i] == null) {
                       guest[i]=input.next();
                       break;
                   }
                   //System.out.println(s);
               }
           }
           if (ans == 3)  {
               System.out.println("Enter Name Of Guest: ");
               String name=input.next();
               for (int i =0; i< guest.length;i++) {
                   if (guest[i] != null && guest[i].equals(name)) {
                       guest[i] = "--";
                       break;
                   }
                   //System.out.println(s);
               }
           }
           if (ans == 4)  {
               System.out.println("Exiting.............. ");
               break;
                }
           //System.out.println(s);
           }
       while (true);


    }
}
