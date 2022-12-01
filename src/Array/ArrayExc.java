package Array;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrayExc {
    public static void main(String[] args) {
        // Exercise 3
        // Create an array of five doubles and give each element some value.
        // Calculate the sum of all the elements and print the result.
        // Calculate the mean/average of the all the elements and print that too.

        double [] alpha = new double[5];
        alpha[0] = 25.33;
        alpha[1] = 16.25;
        alpha[2] = 10.02;
        alpha[3] = 27.06;
        alpha[4] = 17.01;
        double arraySum =Arrays.stream(alpha).sum();
        System.out.println("Total sum of elements in array: " + arraySum);
        System.out.println("Total average of elements in array: " + arraySum/alpha.length);

    }
}
