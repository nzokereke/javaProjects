package UserInput;

import java.util.Scanner;


public class UserInputExb {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the bill total is?: $");
    double bill = scan.nextDouble();

    System.out.print("\nEnter the number of people: ");
    int noOfPeople = scan.nextInt();
    double share = bill / noOfPeople;

    System.out.format("\nBill total: $" + bill+ "\nsplit between:" + noOfPeople + "\n\nEach person pays: $" + share);

}
}