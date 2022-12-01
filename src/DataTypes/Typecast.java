package DataTypes;

public class Typecast {
    public static void main(String[] args) {

        // -----------------------------------------TYPECASTING -------------------------------------------------------
        // 1. Typecasting means converting one type of data into another
        // 2. in the example below java automatically changed the int value(alpha) to a double (beta) referred to as
        //    implicit typecast/conversion (int to a double)

        int alpha = 10;
        double beta = alpha;
        System.out.println(alpha);
        System.out.println(beta);

        // 3. if you flip the above around you get incompatible types as you will lose something in the conversion
        //    int is a whole number and will remove the decimal
        // double charlie = 10.07;
        // int delta = charlie;
        // 4. to be able to convert double to int you must explicitly cast charlie into an int
        double charlie = 10.07;
        int delta = (int) charlie;
        int echo = 3;
        System.out.println(charlie);
        System.out.println(delta);
        // 5. if you want to divide two int without converting the value when initialising
        //    you can do add it to the print parameters
        System.out.println((double) delta / echo);
        System.out.println(((double) delta) / echo);
    }
}
