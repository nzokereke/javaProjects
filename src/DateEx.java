import java.util.Scanner;
import java.time.LocalDate;

public class DateEx {
    static void conFormation (String string, String string2){
        System.out.printf("%s thank you for shopping with us your order -->%s<-- will be with you soon", string, string2);

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // captures input
        System.out.print("Enter your Name: \n");
        String name = scan.nextLine();
        System.out.print("Enter item ordered : \n");
        String item = scan.next();
        System.out.println("Enter the date of Order yyyy-mm-dd: "); // prompts an input
        String input = scan.next(); // captures the input
        LocalDate date = LocalDate.parse(input); // turns the input string into a date
        System.out.println("Item should be delivered within 5 days, expected date of arrival: ");
        System.out.print(date.plusDays(5) + "\n");

        conFormation(name,item);

    }

}

