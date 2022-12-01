package Array;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
//import java.util.random.RandomGenerator;

public class LoopEx3 {
    public static void main(String[] args) {
      int randomNo = ThreadLocalRandom.current().nextInt(1, 100);
      Scanner scan = new Scanner(System.in);
        int i;
        int [] randomNum;
        randomNum = new int[99];

        System.out.print("I have number in mind can you guess it, enter a number here: ");
        System.out.println("---- " + randomNo + " ---- ");

        for (i = 0;i<randomNum.length;i++)
        {
           System.out.print("This number is : ");
            String ansA;
            ansA = scan.next();
            if (ansA.equals("low")) {
                System.out.println("try a higher number");
                System.out.println("here's another number " + (randomNo + 1)) ;
              }
        else if ((!"high".equals(ansA))) {
            System.out.println("try a lower number");
                System.out.println("here's another number " + (randomNo - 1)) ;
        }

        else if (("correct".equals(ansA))) {
                    System.out.println(randomNo + " is the right number, great guess!");
                    break;
              }

        }

        System.out.println("---- " + randomNo + " ---- ");

       /* for(int i= 0; i<userInt.size(); i++){
            for (int j =0; j<randomInt.size(); j++){
                if (userInt[i] == randomInt[j]){*/


      }
    }




