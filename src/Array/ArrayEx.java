package Array;

public class ArrayEx {
    public static void main(String[] args) {
        // Exercise 1
        // Create an integer array of 10 elements and give each element an arbitrary value.
        // Print out the entire array using a loop.

      int [] list = new int[10];
        list[0] = 120;
        list[1] = 11;
        list[2] = 4;
        list[3] = 55;
        list[4] = 89;
        list[5] = 90;
        list[6] = 45;
        list[7] = 7;
        list[8] = 22;
        list[9] = 5;

        for(int i=0; i< list.length; i++){
            System.out.print(list[i]+"\n");

            }
    }

}
