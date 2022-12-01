package EscapeSequence;

public class HelloWorld {
    public static void main(String[] args)
    {
        // ------ Escape Sequences ---------
        // \n - new line
        // \t - tab
        // \b - backspace
        // '\' to escape / e.g file path c:users\project\idea
        // '\' to escape "" within "" e.g. The dog said "woof", then rolled around.
        System.out.print("Hello, world!\n");
        System.out.println("Hello, Africa!");
        System.out.println("Hello, West Africa!");
        System.out.println("The dog said \"woof\", then rolled around.");
        System.out.println("c:users\\aother\\idea projects");
        // tiger is a method call, calling on the tiger method below, you can call the method
        // multiple times in the main
        tiger();
        tiger();
            }

    public static void tiger()
    {
       System.out.println("Tree");
       System.out.println("Grass");
    }
}