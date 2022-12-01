package DataTypes;

public class Int {
    public static void main(String[] args) {
       // ------- ---------------------------------Primitive Data Type -----------------------------------------
       // 1. byte short long and int (default) are similar (all integers) they just have different range of values
       // 2. double (default)or float are used for variables that are assigned decimals
        int a = 10;
        System.out.println(a);
        double b = 10.5;
        System.out.println(b - a);

        // ------Variable Manipulation int / double -----
        // 1. you can set a variable to the result of an expression
        // 2. dividing a value that will return an odd result you should declare the one of the variables as double
        //    or input the int variable as a decimal e.g 2 becomes 2.0
        int c = 5;
        a = a + c + a;
        System.out.print(a/2.0);


    }
}
