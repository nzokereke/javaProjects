package Array;

public class ArrayExb {
    public static void main(String[] args) {
        // Exercise 2
        // Use a loop to populate an array with integers from 1 to 20.
        // Use another loop to print the contents of the array (the elements) backwards.
        int [] numbers = new int[20];
        int count = 0;
        for (int i = 0; i<numbers.length; i++ ) {
            count++;
            numbers[i] = count;
        }
        int counter =20;
        for(int i= 0;i<numbers.length;i++){
            counter --;
            System.out.print("\n" + (numbers[counter]) );
        }
    }
}
