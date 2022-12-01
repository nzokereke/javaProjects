package Array;

public class Array_no {
    public static void main(String[] args) {
        int[] num = {120, 220, 330, 470, 51, 66, 72, 8};
        int i;
        int sumOfNums = 0;
        int even=0;


        for (i = 0; i < num.length; i++) {
            if (num[i] % 2 < 1) {
                System.out.println(num[i]);
                sumOfNums = sumOfNums + num[i];
                even++;
            }
        }
        System.out.printf("Total sum of Numbers: %d%n", sumOfNums);
        System.out.printf("Average of numbers: %d%n", sumOfNums / num.length);
        System.out.printf("Total number of even numbers: %d%n", even);
    }
}