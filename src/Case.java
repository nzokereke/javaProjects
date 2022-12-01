import java.util.Scanner;

public class Case {
    public static void main(String[] args) {

        String[] days = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        Scanner scan = new Scanner(System.in); {
            System.out.print("Enter a day Monday (1), Tuesday (2), Wednesday (3), Thursday (4), Friday (5), Saturday (6) or Friday (7):");
            int ans = Integer.parseInt(scan.next());
            ans --;
            switch (ans) {
                case 0 -> System.out.println("Its " + days[ans] + " remember to take out the rubbish");
                case 1 -> System.out.println("Its " + days[ans] + " remember to call your parents");
                case 2 -> System.out.println("Its " + days[ans] + " remember to to login to Udemy - online learning");
                case 3 -> System.out.println("Its " + days[ans] + " remember to call friend for some tea ");
                case 4 -> System.out.println("Its " + days[ans] + " remember to check accounts");
                case 5 -> System.out.println("Its " + days[ans] + " remember to write up shopping list ");
                case 6 -> System.out.println("Its " + days[ans] + " remember to its a day of rest so relax!");
            }

        }
    }

}

