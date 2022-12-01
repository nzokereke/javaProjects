import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class LoopExe {
    public static void main(String[] args) {
        int randomNo = ThreadLocalRandom.current().nextInt(1, 100);
        Scanner input = new Scanner(System.in);
        int guess;
        int i = 0;
        //System.out.print(randomNo);
        System.out.println("I have a number in mind can you guess what it is? ");
        do {
            System.out.print("\nMake a guess: ");
            guess = input.nextInt();
            i ++;
            if (randomNo > guess) {
                System.out.print("\nTry again Guess a HIGHER number ");
            } else if (randomNo < guess) {
                System.out.print("Try again Guess a LOWER number ");
            } else {
                System.out.print("\nCORRECT");
                System.out.print("\nYou made -" + i + "- guesses");
            }
        } while (randomNo!=guess);
        }
    }









