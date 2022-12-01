import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ans;
        Calculator calc = new Calculator();
        do {
            System.out.print("Enter a for add, s for subtract and e for exit: ");
            String option = scan.next();
            System.out.print("Enter 1st number here: ");
            int number1 = scan.nextInt();
            System.out.print("Enter 2nd number here: ");
            int number2 = scan.nextInt();

            if (option.equals("a")) {
                System.out.print("result is :" + calc.add(number1, number2));
            } else if (option.equals("s")) {
                System.out.println("result is :" + calc.sub(number1, number2)+"\n");
            } else {
                System.out.println("Invalid option leaving program .......");
            }
            System.out.print("\ndo you want to continue yes /no: ");
            ans = scan.next();

        } while (!ans.equals("no"));

    }




    }
