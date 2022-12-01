package GuestList;
import java.util.Scanner;

public class ExOneb {
    public static void main(String[] args) {
        //Exercise 3
        // We currently have to choose option 1 every time we want to view the guest list.
        // Make it so the guests are displayed automatically along with the menu.
        // Then remove this option from the program.


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
            System.out.println("- List Of Guest - ");
            for(int i =0; i< guest.length;i++){
                System.out.println(guest[i]);
            }
            System.out.println("--------------------------------------------------");
            System.out.println("- Menu - ");
            System.out.println("2 - Add Guests");
            System.out.println("3 - Remove Guests");
            System.out.println("4 - Exit");
            System.out.print("Enter an option: ");
            int ans = input.nextInt();

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
                System.out.println("Exiting........................................ ");
                break;
            }
            //System.out.println(s);
        }
        while (true);


    }
}