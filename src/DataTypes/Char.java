package DataTypes;

public class Char {
    public static void main(String[] args) {
        // 1. char initialises a variable with just one character
        // 2. char is based on Unicode in unicode each character has a numeric equivalent
        //    E.G. 65 represents an upper case 'A', 'b' is 98
        // char has a range of 0 - 65535 and this contains different kind of characters and symbols
        char h = 'b';
        char x = 65;
        System.out.println(h);
        System.out.println(x);
        // h(65) + b(98)
        System.out.println(h + x);

        //  ---------------------------------String Data Type ------------------------------
        // 1. its not a primitive data type it's a reference data type
        // 2. Text within double quotes " " are referred to as strings
        // 3. String is capitalised unlike other data types because its referenced
        String p = "people are ";
        String d = "very strange";
        System.out.println(p);
        System.out.println("Hello World!");

        // -----concatenation -----
        // 4. you can concatenate strings using the '+'
        System.out.println(p + d);
        System.out.println("Hello" + " World!");

        // ----------------------------- VARIABLE NAMING RULES & BEST PRACTISE ------------------------
        // 1. Give variable names that reflect the data
        // 2. use camel case i.e. every word is capitalised except for the 1st word and no spaces
        // 3. With boolean uses a statement asking yourself whether its true or false starting with 'is' or 'has'
        // 4. You can use char to store user input e.g 'y' or 'n'
        // 5. Literals are data that has been typed directly into the code
        int age = 55;
        double heightOfBuilding = 80.5;
        boolean isEmployeeOnProbation = true;
        String name = "Joe";

        // 6. variable names can consist of letters, numbers underscore and $ abc123_$
        // 7. Avoid underscore and $
        int $$___ = 7;
        // 8. the style used in naming the string below is call snake case use in c normally in java came case is used
        // 9. variables DO NOT start with a number
        String date_of_birth = "20/05/2001";
        System.out.println($$___);
    }
}
