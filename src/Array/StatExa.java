package Array;

import java.util.Arrays;
import java.util.Scanner;

public class StatExa {


     public static void main(String[] args) {
         String[] name = new String[2];
         name[0] = "Student1";
         name[1] = "Student2";

         int x = 0;
         int[] score = new int[2];
         Scanner scan = new Scanner(System.in);
         int i = 0;
        // char ch = 'y';
         String ans;
         do {
             System.out.print("Enter score for " + name[i] + " : ");
             int studentScore = scan.nextInt();
             score[x] = studentScore;
             x++;
             i++;
             System.out.print("Do you wish to continue? yes/no: ");
             ans = scan.next();

         }
         while (ans.equals("yes"));

         for (i = 0; i < score.length; i++)
             Arrays.stream(score).max();
             int max = Arrays.stream(score).max().getAsInt();
             double avg = Arrays.stream(score).average().getAsDouble();
             System.out.print("Highest score is: " + max);
             System.out.print("Average score is " + avg);
     }
}
