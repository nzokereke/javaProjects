package GuestList;

import java.util.Scanner;

public class ExOneE {

    // Exercise 10
    // If there are no guests on the list it will look like this:
    //  -----------------------------------------
    // - Guests -
    // __________________________________________

    // - Menu -
    // Exercise 11
    // Create a method called addGuest(). Then take the code which adds a
    // guest out of the if-statement and move it into this method. Remember to call addGuest().
    // After that, do the same with the code which removes a guest. Place this code in a method called removeGuest().
    // Then declare a method called insertTestNames(). Move the code which adds five names at
    // the beginning of main() into this method.
    // Exercise 12
    // Modify the “Remove Guest” option so that guests can be removed by their number, rather than by name

    static String[] guest = new String[10];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String name = "name";
        name.toLowerCase();
        System.out.print(name);

        insertTestNames();
        do {
            displayGuest();
            displayMenu();
            int ans = getOption();
            // Add Guest
            if (ans == 1) {
                addGuest();
            }
            // Rename Guest
            else if (ans == 2) {
                renameGuest();
            }
            // Insert Guest
            else if (ans == 3) {
                insertGuests();
            }
            // Remove Guest
            else if (ans == 4) {
                removeGuest();
            }
            // Exit Program
            else if (ans == 5) {
                System.out.println("Exiting........................................ ");
                break;
            }
        }
        while (true) ;
    }

    public static void displayGuest () {
        boolean isEmpty =true;
        int x = 0;
        System.out.println("__________________________________________________");
        System.out.println("- List Of Guest - ");
        for (int i = 0; i < guest.length; i++) {
            if (guest[i] == null) {
                guest[i] = "  ";
            }
        }

        for (int i = 0; i < guest.length; i++) {
             if (!guest[i].equals("  ")) {
                 System.out.println((x+1) + ". " + guest[i]); // this will only display array elements that are not null
                 isEmpty = false;
                 x++;
            }
        }
        if (isEmpty){
            System.out.println("                ");
            System.out.println("Guest list is empty");
            System.out.println("                ");
        }
    }
    public static void displayMenu () {
        System.out.println("--------------------------------------------------");
        System.out.println("- Menu - \n");
        System.out.println("1 - Add Guests");
        System.out.println("2 - Rename Guests");
        System.out.println("3 - Insert Guest ");
        System.out.println("4 - Remove Guests");
        System.out.println("5 - Exit");
    }
    public static int getOption () {
        System.out.print("Enter an option: ");
        int ans = input.nextInt();
        input.nextLine();
        System.out.println();
        return ans;
    }
    public static void addGuest(){
        System.out.print("Enter Name Of Guest: ");
        String guestName = input.nextLine();
        for (int i = 0; i < guest.length; i++) {
            if (guest[i] == "  ") {
                guest[i] = guestName;
                break;
            }
        }

    }

    public static void renameGuest(){
        System.out.print("Enter Guest Number: ");
        int num = input.nextInt();
        for(int i = 0; i < guest.length; i++){
            if (guest[num-1].equals(guest[i])){
                System.out.print("Rename Guest: ");
                String newName = input.next();
                String newNameTwo = input.nextLine();
                guest[i] = newName + newNameTwo;
                System.out.println();
                //return newName;
                break;
            }
        }

    }

    public static void insertGuest(){
        System.out.print("Enter Guest Number: ");
        int num = input.nextInt();
        //for(int i = 0; i < guest.length; i++){
        int i =0;
            if (guest[num-1].equals(guest[i])) {
                System.out.print("Enter Name of Guest: ");
                String newName = input.next();
                String newNameTwo = input.nextLine();
                guest[i] = newName + newNameTwo;
                System.out.println();
                for(i = guest.length - 1;i> num -1;i--){
                    guest[i] = guest[i-1];
                    break;
                }
                guest[num-1] = newName;
            }
       // }
    }
    static void insertGuests() {
        System.out.print("Number: ");
        int num = input.nextInt();
        input.nextLine();

        if (num >= 1 && num <= 10 && guest[num - 1] != null) {
            System.out.print("Name: ");
            String name = input.nextLine();
            for (int i = guest.length - 1; i > num - 1; i--) {
                guest[i] = guest[i - 1];
            }
            guest[num - 1] = name;
        }
        else {
            System.out.println("\nError: There is no guest with that number.");
        }
    }
    public static void insertTestNames(){
        for(int i = 0; i <=5; i++){
            guest[0] = "Abraham";
            guest[1] = "Benjamin";
            guest[2] = "David";
            guest[3] = "Elijah";
            guest[4] = "Ruth";
        }
    }
    public static void removeGuest(){
        System.out.print("Enter Guest No: ");
        int no = (input.nextInt());
        if (no < guest.length || no> guest.length ){
            System.out.println("Error: There is no guest with that number.");
        }
        guest[no-1] = null;

        String hold[] = new String[guest.length];
        int a = 0;
        for (int i = 0; i < guest.length; i++) {
            if (guest[i] != null) {
                hold[a] = guest[i];
                a++;
            }
        }
        guest = hold;


    }


}
