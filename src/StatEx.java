import java.util.Arrays;
import java.util.Scanner;

public class StatEx {


     public static void main(String[] args) {
        String [] name = new String [2];
        name[0] = "Student1";
        name[1] = "Student2";

        int [] score = new int [2];
        Scanner scan = new Scanner(System.in);
        int m =0;
        int x = 0;
        for (m=0; m<score.length; m++) {
            x = m;
          //  System.out.print("Enter name of student: ");
          //  String studentName = scan.next();
          //  name[x] = studentName;
            System.out.print("Enter score for " + name[x] + " : ");
            int studentScore = scan.nextInt();
            score[x] = studentScore;

            System.out.printf("%s  scored %d%n \n", name[x], score[x]);
        }
         System.out.println("The average score for all students is " + Arrays.stream(score).sum()/score.length);

    }
}
