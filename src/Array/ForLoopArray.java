package Array;
import java.util.Scanner;

public class ForLoopArray {
    public static void main(String[] args) {
        // declare variables and array
        int[] traineeMark = new int[5];
        int mark;
        Scanner scan = new Scanner(System.in);
        // you are entering the trainee marks
        for (int i = 0; i < traineeMark.length; i++) {
            System.out.print("Enter trainee mark: ");
            mark = scan.nextInt();
            traineeMark[i] = mark;
           }
        // created a variable highest mark and initialising it with the value in the first element of the array
        // using a for loop each element of the array will be compared with the highestMark if higher the highestMark
        // will be assigned the value of the element.
        int highestMark = traineeMark[0];
        for (int i = 1; i < traineeMark.length; i++) {

            if (traineeMark[i] > highestMark) {
                highestMark = traineeMark[i];
            }
        } System.out.print("the highest mark is: "+highestMark);
    }
}